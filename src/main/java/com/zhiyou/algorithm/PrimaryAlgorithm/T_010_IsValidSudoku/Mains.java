package com.zhiyou.algorithm.PrimaryAlgorithm.T_010_IsValidSudoku;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Mains {

    public static void main(String[] args) {

        String[][] arr = new String[][]{
                {"5", "3", ".", ".", "7", ".", ".", ".", "."},
                {"6", ".", ".", "1", "9", "5", ".", ".", "."},
                {".", "9", "8", ".", ".", ".", ".", "6", "."},
                {"8", ".", ".", ".", "6", ".", ".", ".", "3"},
                {"4", ".", ".", "8", ".", "3", ".", ".", "1"},
                {"7", ".", ".", ".", "2", ".", ".", ".", "6"},
                {".", "6", ".", ".", ".", ".", "2", "8", "."},
                {".", ".", ".", "4", "1", "9", ".", ".", "5"},
                {".", ".", ".", ".", "8", ".", ".", "7", "9"}};

        System.out.println(isValidSudoku(arr));
    }

    public static boolean isValidSudoku(String[][] board) {

        Map<Integer, Set<String>> hang = new HashMap<>();
        Map<Integer, Set<String>> lie = new HashMap<>();
        Map<Integer, Set<String>> zheng = new HashMap<>();
        for (int i = 0; i < board.length; i++) {
            hang.put(i, new HashSet<String>());

            for (int j = 0; j < board[i].length; j++) {
                if (i == 0) {
                    lie.put(j, new HashSet<String>());
                }
                int location = getLocation(i + 1, j + 1);
                if (zheng.get(location) == null) {
                    zheng.put(location, new HashSet<String>());
                }
                if (isNum(board[i][j])) {
                    Set<String> hangSet = hang.get(i);
                    if (hangSet.contains(board[i][j])) {
                        return false;
                    } else {
                        hangSet.add(board[i][j]);
                    }

                    Set<String> lieSet = lie.get(j);
                    if (lieSet.contains(board[i][j])) {
                        return false;
                    } else {
                        lieSet.add(board[i][j]);
                    }

                    Set<String> zhengSet = zheng.get(location);
                    System.out.println("asdf" + zhengSet);
                    if (zhengSet.contains(board[i][j])) {
                        return false;
                    } else {
                        zhengSet.add(board[i][j]);
                    }


                }
            }
        }
        return false;
    }

    private static boolean isNum(String ch) {
        if (ch != null && !"".equals(ch.trim()))
            return ch.matches("^[0-9]*$");
        else
            return false;
    }


    private static Map<String, Integer> map = new HashMap<String, Integer>() {

    };

    static {
        map.put("1,1", 1);
        map.put("1,2", 2);
        map.put("1,3", 3);
        map.put("2,1", 4);
        map.put("2,2", 5);
        map.put("2,3", 6);
        map.put("3,1", 7);
        map.put("3,2", 8);
        map.put("3,3", 9);
    }

    private static int getLocation(int row, int column) {

        int r = row / 3 + row % 3 == 0 ? 0 : 1;
        int c = column / 3 + column % 3 == 0 ? 0 : 1;

        System.out.println(map);
        System.out.println(r + "," + c);
        return map.get(r + "," + c);
    }

}
