<?php
include("connect.php");
include("functions.php");
if(logged_in())
{
	echo "You are logged in!!";
	$profile = get_student_profile($_SESSION['email'],$con);
	$profile = mysqli_fetch_assoc($profile);
?>
<a href="changepassword.php">Change Password</a>
<a href="login.php" style="float:right; padding 10px; margin-right: 40px; background-color: #eee; color:#333; text-decoration: none;">Logout</a>
<?php 
} else {
	echo "You are not logged in";
	header("location:login.php");
	exit();
}
?>
<!DOCTYPE html>
<html>
<head>
	<style>
table {
    border-collapse: collapse;
	}

table, th, td {
    border: 1px solid black;
}
th {
    text-align: center;
    height: 50px;
}
table
{
	width: 100%;
}
th, td {
    padding: 15px;
    text-align: center;
    border: 3px solid black
}

footer {
    
    position: relative;
    height: 25px;
    bottom: -80px;

}
header
{
	position: top;
	text-align: center;
}
nav
{
	text-align: center;
}
head
{
	text-align::center;
}
</style>
	
	<meta charset="utf-8">
	<meta name="viewport" content="width=device-width">
	<meta name="description" content="Simple approach to Chemistry">
	<meta name="keywords" content="Chemistry,vaibhav,Chemistry notes">
	<meta name="author" content="Nikhil Kumar">
	<title>knowledgenest web design | welocome </title>
	<link rel="stylesheet" type="text/css" href="./css/style.css">
</head>
<body>
	<header>
		<div class="container">
			<div id="branding">
				<h1> <span class="highlight">Knowledgenest</span> Chemistry tutorials</h1>
			</div>
			<nav>
				<ul>
					<li class="current"><a href="notes.php">Notes</a></li>
					<li><a href="marks.php">Test Updates</a></li>
					
				</ul>
			</nav>
		</div>
	</header>
	<section>
		<div class="container">
			<h1>Student Profile</h1>
			<table>
				<tbody>
					<tr>
						<th>Name</th>
						<td><?php echo $profile['name']?></td>
					</tr>
					<tr>
						<th>Class</th>
						<td><?php echo $profile['class']?></td>
					</tr>
					<tr>
						<th>Phone Number</th>
						<td><?php echo $profile['phone_no']?></td>
					</tr>
					<tr>
						<th>Parent's Phone Number</th>
						<td><?php echo $profile['parent-no']?></td>
					</tr>
					<tr>
						<th>Address</th>
						<td><?php echo $profile['address']?></td>
					</tr>
					<tr>
						<th>School</th>
						<td><?php echo $profile['school']?></td>
					</tr>
					<tr>
						<th>Email</th>
						<td><?php echo $profile['email']?></td>
					</tr>
				</tbody>
			</table>
		</div>
	</section>
	<footer>
		<p>Knowledgenest, Copyright &copy; 2017   Created by : Nikhil and Bhavya</p>
	</footer>
</body>
</html>