package Classes;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.security.MessageDigest;
import java.util.ArrayList;

public class Methods {

    ArrayList<String> bookedArray = new ArrayList<>();
    static ArrayList<String> textItems = new ArrayList<>();
    ArrayList<String> bookedIndex = new ArrayList<>();
    String[] times = {"09:00", "09:30", "10:00", "10:30", "11:00", "11:30", "12:00", "12:30", "13:00", "13:30", "14:00", "14:30", "15:00", "15:30", "16:00", "16:30", "17:00", "17:30","18:00"};
    String[] rooms = {"", "1", "2", "3", "4", "5"};
    String[][] tableResult = new String[times.length][rooms.length];

    public Methods() {
    }

    public static ArrayList readFile(String dir) {
        textItems.clear();
        String inputLine;
        try {
            BufferedReader read = new BufferedReader(new FileReader(dir));
            while ((inputLine = read.readLine()) != null) {
                textItems.add(inputLine);
            }
            read.close();
            return textItems;
        } catch (IOException e) {
            return null;
        }
    }

    public void writeFile(String dir, ArrayList textItems) {
        try {
            FileOutputStream fout = new FileOutputStream(dir);
            String myString = "";
            for (int i = 0; i < textItems.size(); i++) {
                myString = myString + textItems.get(i) + "\n";
            }
            byte b[] = myString.getBytes();
            fout.write(b);
            fout.close();
        } catch (IOException e) {
            System.out.println("Error: " + e);
        }
    }

    public String hashPassword(String password) throws Exception {
        MessageDigest md = MessageDigest.getInstance("SHA-256");
        md.update(password.getBytes());
        byte[] digest = md.digest();
        StringBuilder hexString = new StringBuilder();
        for (int i = 0; i < digest.length; i++) {
            hexString.append(Integer.toHexString(0xFF & digest[i]));
        }
        password = hexString.toString();
        return password;
    }

    public String[][] fileToArray(String dir, String date) {
        String[] details;
        textItems = Methods.readFile(dir);
        int rowsInFile = textItems.size();
        for (int i = 0; i < rowsInFile; i++) {
            details = textItems.get(i).split(",");
            if (details[1].equals(date)) {
                bookedArray.add(textItems.get(i));
            }
        }
        bubbleSort();
        arrayToTable();
        return tableResult;
    }

    public void bubbleSort() {
        boolean flag;
        String temp;
        do {
            flag = false;
            for (int i = 0; i < bookedArray.size() - 1; i++) {
                String[] temp1 = bookedArray.get(i).split(",");
                String[] temp2 = bookedArray.get(i + 1).split(",");
                if (Integer.parseInt(temp1[3]) > Integer.parseInt(temp2[3])) {
                    temp = bookedArray.get(i + 1);
                    bookedArray.set(i + 1, bookedArray.get(i));
                    bookedArray.set(i, temp);
                    flag = true;
                }
            }
        } while (flag == true);
    }
    
    public void arrayToTable() {
        for (int i = 0; i < times.length; i++) {
            for (int j = 0; j < rooms.length; j++) {
                tableResult[i][j] = tableValue(String.valueOf(i), rooms[j]);
            }
            tableResult[i][0] = times[i];
        }
        longBookings();
    }

    public String tableValue(String TimeRow, String Room) {
        String[] details;
        int loop = bookedArray.size();
        for (int i = 0; i < loop; i++) {
            details = bookedArray.get(i).split(",");
            if (((details[3].equals(TimeRow)) && (details[0].equals(Room)))) {
                loop = i;
                bookedIndex.add(TimeRow + "," + Room);
                return "Booked";
            }
        }
        return "";
    }

    public void longBookings() {
        String[] coordinate = new String[1];
        for (int i = 0; i < bookedIndex.size(); i++) {
            int cleaningTime = 1;
            coordinate = bookedIndex.get(i).split(",");
            for (int j = 0; j < bookedArray.size(); j++) {
                String[] temp = bookedArray.get(j).split(",");
                if (temp[0].equals(coordinate[1]) && temp[3].equals(coordinate[0])) {
                    for (int k = 0; k < (Integer.parseInt(temp[5]) - Integer.parseInt(temp[3])) + cleaningTime; k++) {
                        if ((k)==(Integer.parseInt(temp[5]) - Integer.parseInt(temp[3]))) {
                            tableResult[Integer.parseInt(coordinate[0]) + k + 1][Integer.parseInt(coordinate[1])] = "Cleaning";
                        }else{
                        tableResult[Integer.parseInt(coordinate[0]) + k + 1][Integer.parseInt(coordinate[1])] = "Booked";
                        }
                    }

                }
            }
        }
    }
}
