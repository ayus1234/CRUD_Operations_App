import java.io.IOException;

public abstract class HttpServlet {

    public abstract void init() throws ServletException;

    public abstract void destroy();

    protected abstract void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException;
}
