class SqueakyClean {

    static String clean(String identifier) {

        StringBuilder result = new StringBuilder();
        boolean makeUpperCase = false;

        for (int i = 0; i < identifier.length(); i++) {

            char ch = identifier.charAt(i);

            // Task 1: Replace spaces with underscores
            if (ch == ' ') {
                result.append('_');
            }

            // Task 2: Convert kebab-case to camelCase
            else if (ch == '-') {
                makeUpperCase = true;
            }

            // Task 3: Convert leetspeak to normal text
            else if (ch == '4') {
                result.append('a');
            }
            else if (ch == '3') {
                result.append('e');
            }
            else if (ch == '0') {
                result.append('o');
            }
            else if (ch == '1') {
                result.append('l');
            }
            else if (ch == '7') {
                result.append('t');
            }

            // Task 4: Keep letters and underscores
            else if (Character.isLetter(ch) || ch == '_') {

                if (makeUpperCase) {
                    result.append(Character.toUpperCase(ch));
                    makeUpperCase = false;
                } else {
                    result.append(ch);
                }
            }
        }

        return result.toString();
    }
}