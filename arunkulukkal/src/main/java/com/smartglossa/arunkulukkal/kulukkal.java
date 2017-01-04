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
			String pnumber = request.getParameter("pnumber");
			String name = request.getParameter("name");

			String address = request.getParameter("address");
			String mnumber = request.getParameter("mnumber");

			try {
				Class.forName("com.mysql.jdbc.Driver");
				Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/arunkulukkal", "root",
						"root");
				Statement statement = connection.createStatement();
				String query = "insert into customer(tno,pnumber,name,address,mnumber) values(" + tno + ",'" + pnumber
						+ "','" + name + "','" + address + "','" + mnumber + "')";
				statement.execute(query);
				result.put("status", "Added Successfully");

			} catch (Exception e) {
				result.put("message", "error");

				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			response.getWriter().print(result);
		} else if (operation.equals("updateCustomer")) {
			JSONObject result = new JSONObject();
			int tno = Integer.parseInt(request.getParameter("tno"));
			String pnumber = request.getParameter("pnumber");
			String name = request.getParameter("name");

			String address = request.getParameter("address");
			String mnumber = request.getParameter("mnumber");

			try {
				Class.forName("com.mysql.jdbc.Driver");
				Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/arunkulukkal", "root",
						"root");
				Statement statement = connection.createStatement();
				String query = "update customer set pnumber='" + pnumber + "', name='" + name + "',address='" + address
						+ "',mnumber='" + mnumber + "' where tno=" + tno;
				statement.execute(query);
				result.put("status", " Updated Successfully");

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
						obj.put("pnumber", rs.getString("pnumber"));
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
				result.put("status", "Deleted Successfully");

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
					result.put("pnumber", set.getString("pnumber"));
					result.put("address", set.getString("address"));
					result.put("mnumber", set.getString("mnumber"));

				}
			} catch (Exception e) {
				e.printStackTrace();
			}
			response.getWriter().print(result);

		} else if (operation.equals("getCustomerName")) {
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
					result.put("pnumber", set.getString("pnumber"));
					result.put("address", set.getString("address"));
					result.put("mnumber", set.getString("mnumber"));

				}
			} catch (Exception e) {
				e.printStackTrace();
			}
			response.getWriter().print(result);

		} else if (operation.equals("getCustomerMnumber")) {
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
					result.put("pnumber", set.getString("pnumber"));
					result.put("name", set.getString("name"));

					result.put("address", set.getString("address"));
					result.put("mnumber", set.getString("mnumber"));

				}
			} catch (Exception e) {
				e.printStackTrace();
			}
			response.getWriter().print(result);

		}

		else if (operation.equals("addPrize")) {
			JSONObject result = new JSONObject();
			int pid = Integer.parseInt(request.getParameter("pid"));
			String prizes = request.getParameter("prizes");

			try {
				Class.forName("com.mysql.jdbc.Driver");
				Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/arunkulukkal", "root",
						"root");
				Statement statement = connection.createStatement();
				String query = "insert into prizes(pid,prizes) values(" + pid + ",'" + prizes + "')";
				statement.execute(query);
				result.put("status", "Added Successfully");

			} catch (Exception e) {
				result.put("message", "error");

				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			response.getWriter().print(result);
		}

		else if (operation.equals("winners")) {
			JSONObject result = new JSONObject();
			int pid = Integer.parseInt(request.getParameter("pid"));
			int tno = Integer.parseInt(request.getParameter("tno"));

			try {
				Class.forName("com.mysql.jdbc.Driver");
				Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/arunkulukkal", "root",
						"root");
				Statement statement = connection.createStatement();
				String query = "insert into winners(pid,tno) values(" + pid + ",'" + tno + "')";
				statement.execute(query);
				result.put("status", "Added Successfully");

			} catch (Exception e) {
				result.put("message", "error");

				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			response.getWriter().print(result);
		} else if (operation.equals("getPrizes")) {
			JSONObject result = new JSONObject();
			int tno = Integer.parseInt(request.getParameter("tno"));
			try {
				Class.forName("com.mysql.jdbc.Driver");
				Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/arunkulukkal", "root",
						"root");
				Statement statement = connection.createStatement();
				String query = "select pid from winners where tno=" + tno + "  ";
				ResultSet set = statement.executeQuery(query);
				if (set.next()) {
					int prizeid = set.getInt("pid");
					Class.forName("com.mysql.jdbc.Driver");
					Connection connection1 = DriverManager.getConnection("jdbc:mysql://localhost:3306/arunkulukkal",
							"root", "root");
					Statement stmt = connection1.createStatement();
					String query1 = "select prizes from prizes where pid=" + prizeid;
					ResultSet se = stmt.executeQuery(query1);
					if (se.next()) {
						result.put("prizes", se.getString("prizes"));

					}
				}

			} catch (Exception e) {
				e.printStackTrace();
			}
			response.getWriter().print(result);

		}

	}

}
