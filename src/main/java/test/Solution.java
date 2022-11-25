package test;
public class Solution {
    public static int solution(String str) {//one4seveneight
        StringBuilder answer = new StringBuilder();
        int k = 0;
        while (k < str.length()) {
            String idx = String.valueOf(str.charAt(k));
            String idx2 = String.valueOf(str.charAt(k+1));
            if (idx.equals("z")) {
                answer.append("0");
            }else if (idx.equals("o")) {
                answer.append("1");
                k += 3;
            }else if (idx.equals("t")) {
                if (idx2.equals("w")) {
                    answer.append("2");
                    k += 3;
                }else {
                    answer.append("3");
                    k += 5;
                }
            }else if (idx.equals("f")) {
                if (idx2.equals("o")) {
                    answer.append("4");
                    k += 4;
                }else {
                    answer.append("5");
                    k += 4;
                }
            }else if (idx.equals("s")) {
                if (idx2.equals("i")) {
                    answer.append("6");
                    k += 3;
                }else {
                    answer.append("7");
                    k += 5;
                }
            }else if (idx.equals("e")) {
                answer.append("8");
                k += 5;
            }else if (idx.equals("n")) {
                answer.append("9");
                k += 4;
            }else{
                answer.append(idx);
                k += 1;
            }
        }

        return Integer.parseInt(answer.toString());
    }

    public static void main(String[] args) {
        String str = "one4seveneight";
        System.out.println(solution(str));
    }
}
