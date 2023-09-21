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
 * Servlet implementation class getCarServlet
 */
@WebServlet("/getCarServlet")
public class getCarServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public getCarServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String addedCar = request.getParameter("addedCar");
		
		VehicleInventory addedVehicle = new VehicleInventory(addedCar);
		
		//PrintWriter writer = response.getWriter();
		//writer.println(addedVehicle.toString());
		//writer.close();
		
		request.setAttribute("addedCar", addedVehicle);
		
		getServletContext().getRequestDispatcher("/results.jsp").forward(request, response);
	}

}
