package Controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Model.VehicleInventory;

/**
 * Servlet implementation class throwCarServlet
 */
@WebServlet("/throwCarServlet")
public class throwCarServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public throwCarServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String erasedCar = request.getParameter("erasedCar");
		
		VehicleInventory erasedVehicle = new VehicleInventory(erasedCar);
		
		//PrintWriter writer = response.getWriter();
		//writer.println(erasedVehicle.toString2());
		//writer.close();
		
request.setAttribute("eraseedCar", erasedVehicle);
		
		getServletContext().getRequestDispatcher("/results2.jsp").forward(request, response);
	}

}
