package com.imooc.icanvas.controller;

import com.imooc.icanvas.biz.CanvasBiz;
import com.imooc.icanvas.biz.CategoryBiz;
import com.imooc.icanvas.biz.impl.CanvasBizImpl;
import com.imooc.icanvas.biz.impl.CategoryBizImpl;
import com.imooc.icanvas.entity.Canvas;
import com.imooc.icanvas.entity.Category;
import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileItemFactory;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.Date;
import java.util.List;

public class CanvasController {
    private CanvasBiz canvasBiz = new CanvasBizImpl();
    private CategoryBiz categoryBiz = new CategoryBizImpl();

    public void list(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Canvas> list = canvasBiz.getAll();
        List<Category> categoryList = categoryBiz.getAll();
        request.setAttribute("categoryList", categoryList);
        request.setAttribute("canvasList", list);
        request.getRequestDispatcher("/WEB-INF/pages/admin/canvas_list.jsp").forward(request, response);
    }

    public void toAdd(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Category> categoryList = categoryBiz.getAll();
        request.setAttribute("categoryList", categoryList);

        request.getRequestDispatcher("/WEB-INF/pages/admin/add_canvas.jsp").forward(request, response);
    }

    public void add(HttpServletRequest request, HttpServletResponse response) throws IOException, FileUploadException {
        Canvas canvas = builderCanvas(request);

        canvasBiz.add(canvas);

        response.sendRedirect("list.do");
    }

    public void toEdit(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        Canvas canvas = canvasBiz.get(id);
        List<Category> categoryList = categoryBiz.getAll();
        request.setAttribute("categoryList", categoryList);
        request.setAttribute("canvas", canvas);
        request.getRequestDispatcher("/WEB-INF/pages/admin/update_canvas.jsp").forward(request, response);
    }

    public void edit(HttpServletRequest request, HttpServletResponse response) throws IOException, FileUploadException {
        Canvas canvas = builderCanvas(request);
        canvasBiz.edit(canvas);

        response.sendRedirect("list.do");
    }

    private Canvas builderCanvas(HttpServletRequest request) throws FileUploadException, UnsupportedEncodingException {
        Canvas canvas = new Canvas();
        Date createTime = new Date();
        canvas.setCreateTime(createTime);

        Date updateTime = new Date();
        canvas.setUpdateTime(updateTime);

        FileItemFactory factory = new DiskFileItemFactory();
        ServletFileUpload upload = new ServletFileUpload(factory);
        List<FileItem> list = upload.parseRequest(request);
        for (FileItem item : list) {
            if (item.isFormField()) {
                if (item.getFieldName().equals("categoryId"))
                    canvas.setCategoryId(Integer.parseInt(item.getString("UTF-8")));
                if (item.getFieldName().equals("name"))
                    canvas.setName(item.getString("UTF-8"));

                if (item.getFieldName().equals("creator"))
                    canvas.setCreator(item.getString("UTF-8"));

                if (item.getFieldName().equals("price"))
                    canvas.setPrice(Integer.parseInt(item.getString("UTF-8")));


                if (item.getFieldName().equals("description"))
                    canvas.setDescription(item.getString("UTF-8"));
                if (item.getFieldName().equals("details"))
                    canvas.setDetails(item.getString("UTF-8"));
                if (item.getFieldName().equals("id"))
                    canvas.setId(Integer.parseInt(item.getString("UTF-8")));
                if (item.getFieldName().equals("smallImg") && canvas.getSmallImg() == null)
                    canvas.setSmallImg(item.getString("UTF-8"));
            } else {
                if (item.getFieldName().equals("smallImg")) {
                    if (item.getSize() <= 100) continue;
                    String rootPath = request.getServletContext().getRealPath("/");
                    String path = item.getName();
                    String type = ".jpg";
                    if (path.indexOf(".") != -1) {
                        type = path.substring(path.lastIndexOf("."));
                    }
                    path = "/download/images/" + System.currentTimeMillis() + type;
                    try {
                        item.write(new File(rootPath + path));
                        canvas.setSmallImg(path);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
        }
        return canvas;
    }

    public void remove(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String id = request.getParameter("id");

        canvasBiz.remove(Integer.parseInt(id));

        response.sendRedirect("list.do");
    }
}
