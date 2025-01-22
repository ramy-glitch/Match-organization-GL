<%@page import="java.util.Date"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="Pack.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Stadium Reservation</title>

<link rel="stylesheet" type="text/css" href="stylec.css">

</head>
<body>
<%

    String RType = request.getParameter("RType");
    String homeTeamv = request.getParameter("homeTeam");
    String awayTeamv = request.getParameter("awayTeam");
    String matchType = request.getParameter("matchType");
    String reservationDateStr = request.getParameter("reservationDate");
    String durationDaysStr = request.getParameter("durationDays");
    
    

    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
    Date reservationDatev = null;
    try {
        reservationDatev = sdf.parse(reservationDateStr);
    } catch (Exception e) {
        out.println("Invalid date format.");
    }

    int durationDays = 0;
    try {
        durationDays = Integer.parseInt(durationDaysStr);
    } catch(Exception e) {
        out.println("Invalid number for duration days.");
    }
    
    StadiumReservation rt = null;
    
    // Handle reservation type
    if (RType != null) {
        switch(RType) {
            case "TRAINING":
                rt = StadiumReservation.TRAINING;
                break;
            case "MATCH":
            	rt = StadiumReservation.MATCH;
                break;
            case "MAINTENANCE":
            	rt = StadiumReservation.MAINTENANCE;
                break;
        }
    }
    
    
    
    MatchType mt=null;
    
    // Handle reservation type
    if (matchType != null) {
        switch(matchType) {
            case "LOCAL":
                mt = MatchType.LOCAL;
                break;
            case "FRIENDLY":
            	mt = MatchType.FRIENDLY;
                break;
            case "DERBY":
            	mt = MatchType.DERBY;
                break;
        }
    }


    
    
    
    Stadium stadium = new Stadium(null,null,null,null,0,0,0); // Create a stadium object

    
     
    stadium.reserveStadium(rt, reservationDatev,durationDays);

    Team homeTeam = new Team(homeTeamv,null,null, 1000000,null);
    Team awayTeam = new Team(awayTeamv,null,null, 100,null);
    Match match = new Match(awayTeam,null ,homeTeam,null,"12:00" , mt);
    
%>    

    <div class="container">
    <% if(stadium.getReservationDate()!=null){ %>
    <div class="success-message">Reservation processed successfully!</div>
    <p><strong>Home Team:</strong> <%= homeTeam.getName() %></p>
    <p><strong>Away Team:</strong> <%= awayTeam.getName() %></p>
    <p><strong>Match Type:</strong> <%= match.getType() %></p>
    <p><strong>Reservation Date:</strong> <%= stadium.getReservationDate() %></p>
    <p><strong>Duration (days):</strong> <%= durationDays %></p>
    <p><strong>Release Date:</strong> <%= stadium.getReleaseDate() %></p>
    </div>
    
    <% }else{ %>
    
    <div class="e-message">Reservation  unsuccessful!</div>
    <p><strong>Problem:</strong> you can't reserve in this date </p>
     <% } %>

</body>
</html>