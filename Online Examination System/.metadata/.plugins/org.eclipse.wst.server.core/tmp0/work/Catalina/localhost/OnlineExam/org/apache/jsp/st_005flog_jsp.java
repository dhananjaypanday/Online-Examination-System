/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2017-04-30 16:10:55 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class st_005flog_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


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

      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\"\r\n");
      out.write("   \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <title>JSP Page</title>\r\n");
      out.write("        <script language=\"javascript\">\r\n");
      out.write("function check()\r\n");
      out.write("{\r\n");
      out.write("var txtAD;\r\n");
      out.write("var tx;\r\n");
      out.write("var txt;\r\n");
      out.write("txtAD = document.getElementById('t1');\r\n");
      out.write("tx = document.getElementById('t2');\r\n");
      out.write("\r\n");
      out.write("if (txtAD.value == '') //if(name.value=='')\r\n");
      out.write("{\r\n");
      out.write("alert(\"Enter the User Name\");\r\n");
      out.write("return false;\r\n");
      out.write("}\r\n");
      out.write("if (tx.value == '') //if(name.value=='')\r\n");
      out.write("{\r\n");
      out.write("alert(\"Enter the Password\");\r\n");
      out.write("return false;\r\n");
      out.write("}\r\n");
      out.write("}\r\n");
      out.write("</script>\r\n");
      out.write("  <script>\r\n");
      out.write("function fi()\r\n");
      out.write("    {\r\n");
      out.write("    parent.location='index.jsp'\r\n");
      out.write("    }\r\n");
      out.write("</script>       \r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        <h2 align=\"center\"><font size=\"6\" color=\"#800080\">Student Log In Page</font></h2>\r\n");
      out.write("        ");
 
        HttpSession st=request.getSession();
        String s22=(String)st.getAttribute("et");
        if(s22==null)
            {
            s22="";
        }
        
      out.write("\r\n");
      out.write("        \r\n");
      out.write("        <label><b><font color=\"red\">");
      out.print(s22);
      out.write("</font><b></label>\r\n");
      out.write("        <form id=\"form1\" name=\"f1\" action=\"st_log_in\" method=\"POST\">\r\n");
      out.write("    <b>User Name&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; </b> \r\n");
      out.write("\t<input name=\"t1\" id=\"t1\" style=\"font-weight: 700\" /><b>\r\n");
      out.write("    <br>\r\n");
      out.write("    <br>\r\n");
      out.write("    Password&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; </b> \r\n");
      out.write("\t<input type=\"password\" name=\"t2\" id=\"t2\" style=\"font-weight: 700\" /><b>\r\n");
      out.write("    <br>\r\n");
      out.write("    <br>\r\n");
      out.write("        ");
  
        String s9=null;
        try
{
Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
Connection conn=DriverManager.getConnection("jdbc:odbc:ac");
Statement stat=conn.createStatement();
String str="select c_name from course ";
ResultSet rs= stat.executeQuery(str);

      out.write("<label>Course&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; </label>\r\n");
      out.write("\t</b><select name='d1' id=\"d1\" style=\"font-weight: 700\">\r\n");
      out.write(" <option value='Unknown'>select one</option>\r\n");
      out.write("     ");

while (rs.next())
     {
    s9=rs.getString("c_name");
    
      out.write("\r\n");
      out.write("    <option value='");
      out.print( s9 );
      out.write('\'');
      out.write('>');
      out.print( s9 );
      out.write("</option>\r\n");
      out.write(" ");
  
}

      out.write("\r\n");
      out.write("</select><b>\r\n");
      out.write("         ");

     
}
catch(Exception ae)
{}               

      out.write("\r\n");
      out.write("\t</b>\r\n");
      out.write("\t<p>  \r\n");
      out.write("    <b>  \r\n");
      out.write("    <br>\r\n");
      out.write("    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\r\n");
      out.write("    </b>\r\n");
      out.write("    <input type=\"submit\" value=\"Submit\" name=\"b1\" onclick=\"return check()\" style=\"font-weight: 700\"  /><b>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\r\n");
      out.write("    <a href=\"st_reg.jsp\">New User</a>\r\n");
      out.write("</b>\r\n");
      out.write("</p>\r\n");
      out.write("</form>\r\n");
      out.write("\t\t<b>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\r\n");
      out.write("\t\t</b>\r\n");
      out.write("<input type=\"submit\" value=\"Cancel\" name=\"b2\" onclick=\"fi()\" style=\"font-weight: 700\" /><b>\r\n");
      out.write("\t\t</b>\r\n");
      out.write("        \r\n");
      out.write("        \r\n");
      out.write("        \r\n");
      out.write("    </body>\r\n");
      out.write("</html>\r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}