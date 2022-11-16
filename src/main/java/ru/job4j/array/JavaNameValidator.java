package ru.job4j.array;

public class JavaNameValidator {
    public static boolean isNameValid(String name) {
        boolean valid = false;
        if (name.isEmpty()) {
            valid = false;
        } else {
            for (int i = 0; i < name.length(); i++) {
                int value = name.codePointAt(i);
                if (Character.isUpperCase(name.codePointAt(0)) || Character.isDigit(name.codePointAt(0))) {
                    valid = false;
                    break;
                } else if (isSpecialSymbol(value) || isUpperLatinLetter(value)
                        || isLowerLatinLetter(value) || Character.isDigit(value)) {
                    valid = true;
                    break;
                }
            }
        }
        return valid;
    }

        public static boolean isSpecialSymbol(int code) {
            return code == 36 || code == 95;
        }

        public static boolean isUpperLatinLetter(int code) {
            boolean valid = false;
            for (int i = 65; i <= 90; i++) {
                if (code == i) {
                    valid = true;
                    break;
                }
            }
            return valid;
    }

        public static boolean isLowerLatinLetter(int code) {
        boolean valid = false;
        for (int i = 97; i <= 122; i++) {
            if (code == i) {
                valid = true;
                break;
            }
        }
        return valid;
    }
}

