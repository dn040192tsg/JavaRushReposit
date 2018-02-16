package com.javarush.task.task18.task1815;

import java.util.List;

/* 
Таблица
*/

public class Solution {
    public class TableInterfaceWrapper implements ATableInterface {
        ATableInterface s;

        public TableInterfaceWrapper(ATableInterface s) {
            this.s = s;
        }

        @Override
        public void setModel(List rows) {
            System.out.println(rows.size());
            s.setModel(rows);
        }

        @Override
        public String getHeaderText() {
            return s.getHeaderText().toUpperCase();
        }

        @Override
        public void setHeaderText(String newHeaderText) {
            s.setHeaderText(newHeaderText);
        }
    }

    public interface ATableInterface {
        void setModel(List rows);

        String getHeaderText();

        void setHeaderText(String newHeaderText);
    }

    public static void main(String[] args) {
    }
}