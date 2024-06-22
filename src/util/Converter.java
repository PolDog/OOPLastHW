package util;

import java.util.ArrayList;

public class Converter {
    public int convertToInt(String value) {
        int var;
        try {
            var = Integer.parseInt(String.valueOf(value));
        } catch (Exception e) {
            var = 0;
        }
        return var;
    }

    public double convertToDouble(String value) {
        double var;
        try {
            var = Double.parseDouble(String.valueOf(value));
        } catch (Exception e) {
            var = 0;
        }
        return var;
    }

    public ArrayList<Double> convertToComplex(String value) {
        String[] text;
        ArrayList<Double> amount = new ArrayList<>();
        if (value == "") {
            amount.add(0.0);
            amount.add(0.0);
            return amount;
        }
        try {
            text = value.split("\\+");
            amount.add(Double.parseDouble(text[0]));
            if (text[1].equals("i")) {
                amount.add(1.0);
            } else {
                text[1] = text[1].replace("i", "");
                amount.add(Double.parseDouble(text[1]));
            }

        } catch (Exception e) {
            try {
                text = value.split("\\-");
                amount.add(Double.parseDouble(text[0]));
                if (text[1].equals("i")) {
                    amount.add(-1.0);
                } else {
                    text[1] = text[1].replace("i", "");
                    amount.add(Double.parseDouble(text[1]) * (-1));
                }
            } catch (Exception e1) {
                amount.add(Double.parseDouble(value));
                amount.add(0.0);
            }
        }
        return amount;
    }

    public String convertComplexToString(ArrayList<Double> a) {
        String out = String.valueOf(a.getFirst());
        if (a.getLast() != 0) {
            if (a.getLast() > 0) {
                out = a.getFirst() + "+" + a.getLast() + "i";
            } else {
                out = a.getFirst() + "" + a.getLast() + "i";
            }
        }
        return out;
    }

}
