package dong.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
@RequestMapping("Upload")
public class UploadController {
  @RequestMapping(value = "/upload-file",method = RequestMethod.GET)
  public String upload(){
    return "upload/upload";
  }
  @RequestMapping(value = "/upload-file",method = RequestMethod.POST)
  public String uploadFile(HttpServletRequest request,@RequestParam("file")MultipartFile file , ModelMap modelMap){
    modelMap.addAttribute("file",file);
    return "upload/viewUpload";
  }
}
