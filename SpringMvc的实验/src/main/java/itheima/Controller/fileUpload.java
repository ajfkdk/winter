package itheima.Controller;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.UUID;

@Controller
@RequestMapping("/file")
public class fileUpload {
//    一般的上传方式
    @RequestMapping("fileUpload")
    public String  fileupload(HttpServletRequest request) throws Exception {
//        获取到要上传的文件目录
//        String path = request.getSession().getServletContext().getRealPath("/upload");
        String path = "C:\\Users\\86151\\Desktop\\Service";
//        创建file对象，一会向改路径下上传文件
        File file = new File(path);
//        判断路径是否存在，如果不存在，创建路径
        if (!file.exists()) {
            file.mkdir();
        }
//        创建磁盘文件工厂
        DiskFileItemFactory factory = new DiskFileItemFactory();
        ServletFileUpload fileUpload = new ServletFileUpload(factory);

//        解析request对象获取文件的数据
        List<FileItem> list = fileUpload.parseRequest(request);
//        遍历
        for (FileItem fileItem : list) {
//        判断文件项是佛普通字段，还是上传的文件
            if (fileItem.isFormField()) {
            }
//        上传文件项
            else {
//        获取到上传文件的名称
                String filename = fileItem.getName();
                fileItem.write(new File(file,filename));
                fileItem.delete();
            }
        }
//        上传文件
//        删除临时文件
        return "success";
    }

    //    使用了SpringMVC的上传方式
    @RequestMapping("fileUpload2")
    public String fileUpload(HttpServletRequest request, MultipartFile upload) throws IOException {
        System.out.println("正在以SpringMVC的方式上床");
//        先获取要上传的文件目录
        String path = "C:\\Users\\86151\\Desktop\\Service";
//        创建file对象，待会通过该路径上传文件
        File file = new File(path);
//        判断路径是否存在，如果不存在，创建该路径
        if (!file.exists()) {
            file.mkdir();
        }
//        获取到上传文件的名称
        String filename = upload.getOriginalFilename();
//        把文件的名称唯一化
        String uuid = UUID.randomUUID().toString().replaceAll("-", "").toUpperCase();
        filename = uuid + "_" + filename;
//        把文件转发到file对象里面去，并以filename名称命名
        upload.transferTo(new File(file,filename));
        return "success";
    }
}
