package org.apache.jsp.assests.jsp.design;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class DynamicMain_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<link href=\"../css/main.css\" rel=\"stylesheet\">\n");
      out.write("  <main >\n");
      out.write("        <div id=\"mainDiv\">\n");
      out.write("         \n");
      out.write("          \n");
      out.write("          <div class=\"row\">\n");
      out.write("              <div class=\"card column\" style=\"width: 18rem;\">\n");
      out.write("                  <div class=\"imag\"><img class=\"card-img-top\" src=\"../images/armchair-art-chair-696407.jpg\" alt=\"Arm Chair\"></div>\n");
      out.write("  <div class=\"card-body\">\n");
      out.write("    <h6 class=\"card-title\">Abbey Solid Wood Arm Chair in Provincial Teak Finish by Woodsworth</h6>\n");
      out.write("    <p class=\"card-text\">By Woodsworth</p>\n");
      out.write("      <b>Rs.2000</b>\n");
      out.write("    <a href=\"#\" class=\"btn btn-primary btn-sm\">ADD TO CART</a>\n");
      out.write("  </div>\n");
      out.write("</div>\n");
      out.write("       \n");
      out.write("        <div class=\"card column\" style=\"width: 18rem;\">\n");
      out.write("  <div class=\"imag\"><img class=\"card-img-top\" src=\"../images/antique-961102_1280.png\" alt=\"Arm Chair\"></div>\n");
      out.write("  <div class=\"card-body\">\n");
      out.write("    <h6 class=\"card-title\">Modway Track Circular Dining Table in Wood</h6>\n");
      out.write("    <p class=\"card-text\">By Mothway</p>\n");
      out.write("      <b>Rs.1000</b>\n");
      out.write("    <a href=\"#\" class=\"btn btn-primary btn-sm\">ADD TO CART</a>\n");
      out.write("  </div>\n");
      out.write("</div>\n");
      out.write("       \n");
      out.write("        <div class=\"card column\" style=\"width: 18rem;\">\n");
      out.write("  <div class=\"imag\"><img class=\"card-img-top\" src=\"../images/furniture-768766_1280.jpg\" alt=\"Arm Chair\"></div>\n");
      out.write("  <div class=\"card-body\">\n");
      out.write("    <h6 class=\"card-title\">Sudan One Seater Lounge Chair in White Colour by Furnitech</h6>\n");
      out.write("    <p class=\"card-text\">By Furnitech</p>\n");
      out.write("      <b>Rs.20,000</b>\n");
      out.write("    <a href=\"#\" class=\"btn btn-primary btn-sm\">ADD TO CART</a>\n");
      out.write("  </div>\n");
      out.write("</div>\n");
      out.write("        \n");
      out.write("         \n");
      out.write("         \n");
      out.write("          </div>\n");
      out.write("<!-- ROW 2 -->\n");
      out.write("           <div class=\"row\">\n");
      out.write("              <div class=\"card column\" style=\"width: 18rem;\">\n");
      out.write("  <div class=\"imag\"><img class=\"card-img-top\" src=\"../images/architecture-1171462_1280.jpg\" alt=\"Chair set\"></div>\n");
      out.write("  <div class=\"card-body\">\n");
      out.write("    <h6 class=\"card-title\">Kevon Metal Chair in White Colour by Bohemiana</h6>\n");
      out.write("    <p class=\"card-text\">By Bohemiana</p>\n");
      out.write("      <b>Rs.12,000</b>\n");
      out.write("    <a href=\"#\" class=\"btn btn-primary btn-sm\">ADD TO CART</a>\n");
      out.write("  </div>\n");
      out.write("</div>\n");
      out.write("       \n");
      out.write("        <div class=\"card column\" style=\"width: 18rem;\">\n");
      out.write("  <div class=\"imag\"><img class=\"card-img-top\" src=\"../images/bed-bedroom-clean-775219.jpg\" alt=\"Arm Chair\"></div>\n");
      out.write("  <div class=\"card-body\">\n");
      out.write("    <h6 class=\"card-title\">Ainu Single Bed with Trundle in Walnut Finish by Mintwud</h6>\n");
      out.write("    <p class=\"card-text\">by Mintwud</p>\n");
      out.write("      <b>Rs.27,000</b>\n");
      out.write("    <a href=\"#\" class=\"btn btn-primary btn-sm\">ADD TO CART</a>\n");
      out.write("  </div>\n");
      out.write("</div>\n");
      out.write("       \n");
      out.write("        <div class=\"card column\" style=\"width: 18rem;\">\n");
      out.write("  <div class=\"imag\"><img class=\"card-img-top\" src=\"../images/sofa-3094153_640.jpg\" alt=\"Arm Chair\"></div>\n");
      out.write("  <div class=\"card-body\">\n");
      out.write("    <h6 class=\"card-title\">Alfredo LHS Two Seater Sofa with Lounger and Cushions in  Grey Colour by CasaCraft</h6>\n");
      out.write("    <p class=\"card-text\">by CasaCraft</p>\n");
      out.write("      <b>Rs.9000</b>\n");
      out.write("    <a href=\"#\" class=\"btn btn-primary btn-sm\">ADD TO CART</a>\n");
      out.write("  </div>\n");
      out.write("</div>\n");
      out.write("        \n");
      out.write("         \n");
      out.write("         \n");
      out.write("          </div>\n");
      out.write("          \n");
      out.write("                    \n");
      out.write("    <!-- Row 3 -->                                    \n");
      out.write("          \n");
      out.write("          \n");
      out.write("      <div class=\"row\">\n");
      out.write("              <div class=\"card column\" style=\"width: 18rem;\">\n");
      out.write("  <div class=\"imag\"><img class=\"card-img-top\" src=\"assests/images/wooden-bench-3392273_1920.jpg\" alt=\"Outdoor bench\"></div>\n");
      out.write("  <div class=\"card-body\">\n");
      out.write("    <h6 class=\"card-title\">Latt Upholstered Bench</h6>\n");
      out.write("    <p class=\"card-text\">By Woodsworth</p>\n");
      out.write("      <b>Rs.2000</b>\n");
      out.write("    <a href=\"#\" class=\"btn btn-primary btn-sm\">ADD TO CART</a>\n");
      out.write("  </div>\n");
      out.write("</div>\n");
      out.write("       \n");
      out.write("        <div class=\"card column\" style=\"width: 18rem;\">\n");
      out.write("  <div class=\"imag\"><img class=\"card-img-top\" src=\"assests/images/throne-2790789_1920.png\" alt=\"Throne Chair\"></div>\n");
      out.write("  <div class=\"card-body\">\n");
      out.write("    <h6 class=\"card-title\">RARE MID CENTURY CHESTERFIELD LUTYEN'S STYLE VICEROY'S OXBLOOD LEATHER ARMCHAIR</h6>\n");
      out.write("    <p class=\"card-text\">By Woodsworth</p>\n");
      out.write("      <b>Rs.2000</b>\n");
      out.write("    <a href=\"#\" class=\"btn btn-primary btn-sm\">ADD TO CART</a>\n");
      out.write("  </div>\n");
      out.write("</div>\n");
      out.write("       \n");
      out.write("        <div class=\"card column\" style=\"width: 18rem;\">\n");
      out.write("  <div class=\"imag\"><img class=\"card-img-top\" src=\"assests/images/room-2066402_1920.jpg\" alt=\"Arm Chair\"></div>\n");
      out.write("  <div class=\"card-body\">\n");
      out.write("    <h6 class=\"card-title\">Stalley Solid Wood Arm Chair with Brown Uphosltery in Honey Oak Finish by Amberville</h6>\n");
      out.write("    <p class=\"card-text\">By Amberville</p>\n");
      out.write("      <b>Rs.2000</b>\n");
      out.write("    <a href=\"#\" class=\"btn btn-primary btn-sm\">ADD TO CART</a>\n");
      out.write("  </div>\n");
      out.write("</div>\n");
      out.write("        \n");
      out.write("         \n");
      out.write("         \n");
      out.write("          </div>      \n");
      out.write("           </div>\n");
      out.write("           \n");
      out.write("        </main>\n");
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
