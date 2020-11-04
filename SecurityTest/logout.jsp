<% 
        request.getSession().invalidate();
        request.logout();
        response.sendRedirect("/SecurityTest-war/login.jsp");
 %>
