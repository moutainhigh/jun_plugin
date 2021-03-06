

import java.io.IOException;

import com.jun.plugin.gzip.compressclient.compress.CompressUtils;
import com.jun.plugin.gzip.compressclient.encrypt.AESUtils;

/**
 * 
 * @author Wujun
 *
 */
public class Test {

    public static void main(String [] args){
        String content="test1234567890 test1234567890 test1234567890 test1234567890 test1234567890 test1234567890 test1234567890"
        		+ " test1234567890 test1234567890 test1234567890 test1234567890 test1234567890 test1234567890 test1234567890"
        		+ " test1234567890 test1234567890 test1234567890 test1234567890 test1234567890 test1234567890 test1234567890"
        		+ " test1234567890 test1234567890 test1234567890 test1234567890 test1234567890 test1234567890 test1234567890 "
        		+ "test1234567890 test1234567890 test1234567890 test1234567890 test1234567890 test1234567890 test1234567890 "
        		+ "test1234567890 test1234567890 test1234567890 test1234567890 test1234567890 test1234567890 test1234567890 "
        		+ "test1234567890 test1234567890 test1234567890 test1234567890 test1234567890 test1234567890 test1234567890"
        		+ " test1234567890 test1234567890 test1234567890 test1234567890 test1234567890 test1234567890 test1234567890 "
        		+ "test1234567890 test1234567890 test1234567890 test1234567890 test1234567890 test1234567890 test1234567890 "
        		+ "test1234567890 test1234567890 test1234567890 test1234567890 test1234567890 test1234567890 test1234567890"
        		+ " test1234567890 test1234567890 test1234567890 test1234567890 test1234567890 test1234567890 test1234567890 "
        		+ "test1234567890 test1234567890 test1234567890 test1234567890 test1234567890 test1234567890 test1234567890";
        System.out.println("Step1 压缩前长度:" + content.length());
        try{
        	// 压缩
            String afterCompressStr = CompressUtils.compress(content);
            System.out.println("Step2 压缩后长度:" + afterCompressStr.length());

            // 加密
            String afterEncryptStr = AESUtils.encrypt(afterCompressStr);
            System.out.println("Step3 先压缩后加密的长度:" + afterEncryptStr.length());
            System.out.println("Step3 先压缩后加密的content:" + afterEncryptStr);

            // 先加密后压缩
            String _afterEncryptStr = AESUtils.encrypt(content);
            System.out.println("先加密的长度:" +_afterEncryptStr);
            String _afterCompressStr = CompressUtils.compress(_afterEncryptStr);
            System.out.println("先加密后压缩的长度:" + _afterCompressStr.length());
            
            // 解密
//            String afterEncryptStrVal=afterEncryptStr;
            String afterEncryptStrVal="317527a4f396b23b66c244c33c84db10c16ecfb649cb005aa873a77a84dd0a68ccbbf4b5f99d9caaf75697c0e9bd4b7286797b6a794759837789ff11dba6d3d5";
            String afterDecryptStr = AESUtils.decrypt(afterEncryptStrVal);
            System.out.println("Step4 解密:" + afterDecryptStr.length());
            

            // 解压缩
            String afterDecryptContent = CompressUtils.decompressToStr(afterDecryptStr);
            System.out.println("Step5 解压缩:" + afterDecryptContent.length());
            System.out.println("Step5 解压缩:" + afterDecryptContent);
            
            

        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}
