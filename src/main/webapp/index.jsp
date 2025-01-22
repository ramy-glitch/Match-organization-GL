<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Stadium Reservation</title>

<link rel="stylesheet" type="text/css" href="stylei.css">

</head>
<body>

    <h1>Reservation Form</h1>
    <form action="connec.jsp" method="post">
    
        <label>Reservation Type:</label><br>
        <select name="RType" required>
		    <option value="TRAINING">TRAINING</option>
		    <option value="MATCH">MATCH</option>
		    <option value="MAINTENANCE">MAINTENANCE</option>
		</select><br><br>
    
        <label>Home Team:</label><br>
        <input type="text" name="homeTeam" required><br><br>

        <label>Away Team:</label><br>
        <input type="text" name="awayTeam" required><br><br>


        <label>Match Type:</label><br>
        <select name="matchType" required>
		    <option value="LOCAL">LOCAL</option>
		    <option value="FRIENDLY">FRIENDLY</option>
		    <option value="DERBY">DERBY</option>
		</select><br><br>

        <label>Reservation Date:</label><br>
        <input type="date" name="reservationDate" required><br><br>

        <label>Duration (days):</label><br>
        <input type="number" name="durationDays" required><br><br>

        <input type="submit" value="Reserve Stadium">
    </form>

</body>
</html>