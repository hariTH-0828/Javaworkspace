package workSpace.src.array;

import java.util.HashMap;

public class MaximumBalloon {

    public int maxBalloon(String text) {
        String word = "balloon";
        HashMap<Character, Integer> wordMap = new HashMap<>();
        HashMap<Character, Integer> textMap = new HashMap<>();

        for (char letter : word.toCharArray()) {
            wordMap.put(letter, wordMap.getOrDefault(letter,0) + 1);
        }
        for (char letter : text.toCharArray()) {
            textMap.put(letter, textMap.getOrDefault(letter,0) + 1);
        }

        int result = text.length();
        for (char letter : wordMap.keySet()) {
            if(!textMap.containsKey(letter)) {
                return 0;
            }
            int temp = textMap.get(letter) / wordMap.get(letter);
            result = Math.min(result, temp);
        }
        return result;
    }
    public static void main(String[] args) {
        String text = "krhizmmgmcrecekgyljqkldocicziihtgpqwbticmvuyznragqoyrukzopfmjhjjxemsxmrsxuqmnkrzhgvtgdgtykhcglurv" +
                "ppvcwhrhrjoislonvvglhdciilduvuiebmffaagxerjeewmtcwmhmtwlxtvlbocczlrppmpjbpnifqtlninyzjtmazxdbzwxthpvrfulvrsp" +
                "ycqcghuopjirzoeuqhetnbrcdakilzmklxwudxxhwilasbjjhhfgghogqoofsufysmcqeilaivtmfziumjloewbkjvaahsaaggteppqyuoyl" +
                "gpbdwqubaalfwcqrjeycjbbpifjbpigjdnnswocusuprydgrtxuaojeriigwumlovafxnpibjopjfqzrwemoinmptxddgcszmfprdrichjeqcvikynzigleaajcysusqasqadjemgnyvmzmbcfrttrzonwafrnedglhpudovigwvpimttiketopkvqw";
        System.out.println(new MaximumBalloon().maxBalloon(text));
    }
}
