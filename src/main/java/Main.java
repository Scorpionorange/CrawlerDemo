/**
 * Created by ScorpionOrange on 2017/01/09.
 */
public class Main {
    public static void main(String[] args){

        // 定义即将访问的链接
        String url = "https://zhuanlan.zhihu.com/p/25070516";
        // 调用WebsiteSourceCode().getWebsiteSourceCode()方法，返回目标网页的源代码(String)；
        //System.out.println(new WebsiteSourceCode().getWebsiteSourceCode(url));

        String filePath = "C:\\迅雷下载";
        String fileName = "Test.txt";
        new WebsiteSourceCode().getWebsiteSourceCode(url, filePath, fileName);
    }
}
