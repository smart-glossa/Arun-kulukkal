package com.smartglossa.arunkulukkal;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.JSONArray;
import org.json.JSONObject;

/**
 * Servlet implementation class kulukkal
 */
public class kulukkal extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public kulukkal() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String operation = request.getParameter("operation");
		if (operation.equals("addCustomer")) {
			JSONObject result = new JSONObject();
			int tno = Integer.parseInt(request.getParameter("tno"));
			String name = request.getParameter("name");

			String address = request.getParameter("address");
			String mnumber = request.getParameter("mnumber");

			try {
				Class.forName("com.mysql.jdbc.Driver");
				Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/arunkulukkal", "root",
						"root");
				Statement statement = connection.createStatement();
				String query = "insert into customer(tno,name,address,mnumber) values(" + tno + ",'" + name + "','"
						+ address + "','" + mnumber + "')";
				statement.execute(query);
				result.put("status", "success");

			} catch (Exception e) {
				result.put("message", "error");

				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			response.getWriter().print(result);
		} else if (operation.equals("updateCustomer")) {
			JSONObject result = new JSONObject();
			int tno = Integer.parseInt(request.getParameter("tno"));
			String name = request.getParameter("name");

			String address = request.getParameter("address");
			String mnumber = request.getParameter("mnumber");

			try {
				Class.forName("com.mysql.jdbc.Driver");
				Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/arunkulukkal", "root",
						"root");
				Statement statement = connection.createStatement();
				String query = "update customer set name='" + name + "',address='" + address + "',mnumber='" + mnumber
						+ "' where tno=" + tno;
				statement.execute(query);
				result.put("status", "success");

			} catch (Exception e) {
				result.put("message", "error");

				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			response.getWriter().print(result);
		} else if (operation.equals("getAllCustomer")) {
			JSONArray result = new JSONArray();
			{
				try {
					Class.forName("com.mysql.jdbc.Driver");
					Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/arunkulukkal",
							"root", "root");
					Statement statement = connection.createStatement();
					String query = "select * from customer";
					ResultSet rs = statement.executeQuery(query);
					while (rs.next()) {
						JSONObject obj = new JSONObject();
						obj.put("tno", rs.getInt("tno"));
						obj.put("name", rs.getString("name"));

						obj.put("address", rs.getString("address"));
						obj.put("mnumber", rs.getString("mnumber"));

						result.put(obj);

					}

				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				response.getWriter().print(result);
			}
		} else if (operation.equals("deleteCustomer")) {
			JSONObject result = new JSONObject();
			int tno = Integer.parseInt(request.getParameter("tno"));
			try {
				Class.forName("com.mysql.jdbc.Driver");
				Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/arunkulukkal", "root",
						"root");
				Statement statement = connection.createStatement();
				String query = "delete from customer where tno=" + tno;
				statement.execute(query);
				result.put("Deleted", "Successfully");

			} catch (Exception e) {
				result.put("status", "error");
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			response.getWriter().print(result);
		} else if (operation.equals("getOneCustomer")) {
			JSONObject result = new JSONObject();
			int tno = Integer.parseInt(request.getParameter("tno"));
			
			try {
				Class.forName("com.mysql.jdbc.Driver");
				Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/arunkulukkal", "root",
						"root");
				Statement statement = connection.createStatement();
				String query = "select * from customer where tno=" + tno + "  ";
				ResultSet set = statement.executeQuery(query);
				if (set.next()) {
					result.put("tno", set.getInt("tno"));
					result.put("name", set.getString("name"));

					result.put("address", set.getString("address"));
					result.put("mnumber", set.getString("mnumber"));

				}
			} catch (Exception e) {
				e.printStackTrace();
			}
			response.getWriter().print(result);

		}
		else if (operation.equals("getCustomerName")) {
			JSONObject result = new JSONObject();
			
			String name = request.getParameter("name");
			try {
				Class.forName("com.mysql.jdbc.Driver");
				Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/arunkulukkal", "root",
						"root");
				Statement statement = connection.createStatement();
				String query = "select * from customer where name='" + name + "'  ";
				ResultSet set = statement.executeQuery(query);
				if (set.next()) {
					result.put("tno", set.getInt("tno"));
					result.put("name", set.getString("name"));

					result.put("address", set.getString("address"));
					result.put("mnumber", set.getString("mnumber"));

				}
			} catch (Exception e) {
				e.printStackTrace();
			}
			response.getWriter().print(result);

		}
		else if (operation.equals("getCustomerMnumber")) {
			JSONObject result = new JSONObject();
			
			String mnumber = request.getParameter("mnumber");
			try {
				Class.forName("com.mysql.jdbc.Driver");
				Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/arunkulukkal", "root",
						"root");
				Statement statement = connection.createStatement();
				String query = "select * from customer where mnumber='" + mnumber + "'  ";
				ResultSet set = statement.executeQuery(query);
				if (set.next()) {
					result.put("tno", set.getInt("tno"));
					result.put("name", set.getString("name"));

					result.put("address", set.getString("address"));
					result.put("mnumber", set.getString("mnumber"));

				}
			} catch (Exception e) {
				e.printStackTrace();
			}
			response.getWriter().print(result);

		}


	}

}
