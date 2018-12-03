<%@page import="com.itn.curd.entity.Student" %>
<%@page import="java.util.List" %>

<html>
    <head>
        <title>Create</title>
    </head>
    <body>
        <table>
            <tr>
                <th>ID</th>
                <th>Name</th>
                <th>Address</th>
            </tr>
            <%List<Student> stuList=(List<Student>) request.getAttribute("list"); 
            for(Student stu:stuList){
            %>
            
            <tr>
                <td>
                    <%out.print(stu.getId());%>
                </td>
                <td>
                    <%out.print(stu.getName());%>
                </td>
                <td>
                    <%out.print(stu.getAddress());%>
                </td>
            </tr>
            <%}%>
        </table>
    </body>
</html>

