package JianZhiOffer;

/**
 * @program: Leetcode
 * @description: 替换空格
 * @author: lingving
 * @create: 2020-08-14 22:02
 **/
public class Jz05 {
    public String replaceSpace(String s) {
        StringBuilder sr = new StringBuilder();
        for(int i = 0 ; i < s.length() ; i++){
            if(s.charAt(i)== ' '){
               sr.append("%20");
            }else{
                sr.append(s.charAt(i));
            }

        }
        return sr.toString();

    }
}
