package workSpace.src.array;

import java.util.HashSet;

public class UniqueEmail {
    public int getUnique(String[] emails) {
        HashSet<String> emailHolder = new HashSet<>();
        for (int i = 0; i < emails.length; i++) {
            StringBuilder tempEmail = new StringBuilder();
            for (int j = 0; j < emails[i].length(); j++) {
                if(emails[i].charAt(j) != '.' && emails[i].charAt(j) != '+' && emails[i].charAt(j) != '@'){
                    tempEmail.append(emails[i].charAt(j));
                }else if(emails[i].charAt(j) == '+' || emails[i].charAt(j) == '@') {
                    while (emails[i].charAt(j) != '@') {
                        j++;
                    }
                    while (j < emails[i].length()) {
                        tempEmail.append(emails[i].charAt(j++));
                    }
                }
            }
            System.out.println(tempEmail);
            emailHolder.add(tempEmail.toString());
        }
        return emailHolder.size();
    }

    public static void main(String[] args) {
        String[] emails = {"test.email+alex@leetcode.com", "test.email@leetcode.com"};
        System.out.println(new UniqueEmail().getUnique(emails));
    }
}
