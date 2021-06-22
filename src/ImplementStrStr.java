public class ImplementStrStr {

    public int strStr(String haystack, String needle) {
        if (needle == null || needle.isEmpty()) {
            return 0;
        }
        if (haystack.length() == 0) {
            return -1;
        }

        for (int i = 0; i <= haystack.length() - needle.length(); i++) {
            String subString = haystack.substring(i, i + needle.length());
            if (subString.equals(needle)) {
                return i;
            }
        }
        return -1;
    }

}
