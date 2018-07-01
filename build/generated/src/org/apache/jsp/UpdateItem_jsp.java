package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.supermkt.shoppingcrt.service.impl.ItemCategoryServiceImpl;
import com.supermkt.shoppingcrt.dto.ItemCategoryDTO;
import java.util.List;

public final class UpdateItem_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Update Item</title>\n");
      out.write("        <style>\n");
      out.write("            table{\n");
      out.write("                margin-left:auto; \n");
      out.write("                margin-right:auto; \n");
      out.write("            }\n");
      out.write("            div{\n");
      out.write("                text-align: center\n");
      out.write("            }\n");
      out.write("            h1{\n");
      out.write("                text-align: center\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h1>Update Item</h1>\n");
      out.write("        <form action=\"UpdateItemController\">\n");
      out.write("            <table>\n");
      out.write("                <tr>\n");
      out.write("                    <td>Item ID</td>\n");
      out.write("                    <td><input type=\"text\" name=\"ItemID\"</td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>Item Category</td>\n");
      out.write("                    <td>\n");
      out.write("                        <select id=\"itemCat\" name=\"itemCat\">\n");
      out.write("                            ");

                           List<ItemCategoryDTO> getitemcat=new ItemCategoryServiceImpl().showItemCategories();
                           for(ItemCategoryDTO categoryDTO:getitemcat){
                        
      out.write("\n");
      out.write("                        <option>  ");
      out.print(categoryDTO.getItemCategory());
      out.write(" </option>\n");
      out.write("                        ");

                           }
                        
      out.write("\n");
      out.write("                        </select>\n");
      out.write("                    </td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>Item Name</td>\n");
      out.write("                    <td><input type=\"text\" name=\"ItemName\"</td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>Item Quantity</td>\n");
      out.write("                    <td><input type=\"text\" name=\"ItemQty\"</td>\n");
      out.write("                </tr>\n");
      out.write("            </table>\n");
      out.write("            <div><input type=\"submit\" value=\"Update\"></div>\n");
      out.write("        </form>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
