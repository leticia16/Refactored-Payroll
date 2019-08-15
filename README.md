# Refactored-Payroll
Refactored Payroll to Software Project Discipline - UFAL 2019.01

<h2>Operations used to Refactor</h2>
<h3>Strategy</h3>
<b>Applied to the following classes</b><br><br>
-> StrategyMenu (interface)<br>
-> AddEmployee<br>
-> RemoveEmployee<br>
-> Launch a Card Point<br>
-> Launch Sales Result<br>
-> Launch Service Rate<br>
-> Edit Employee<br>
-> Payroll<br>
-> Print EmployeeList<br>
-> NextDay<br>
-> Choose A Different Agenda<br>
-> New Agenda<br>
--------------------------------------------------------<br>
-> StrategyPayRoll (interface)<br>
-> Pay1<br>
-> Pay2<br>
--------------------------------------------------------<br>
-> StrategyEdit (interface)<br>
-> Change Name<br>
-> Change Address<br>
-> Change Salary <br>
-> Change Syndicate <br>
-> Change Employee Type <br>
--------------------------------------------------------<br>
-> StrategyChangeEmployeeType (interface)<br>
-> Change To Hourly <br>
-> Change To Commissined<br>
-> Change To Salaried <br>

<h3>Iterator</h3>
<b>Applied to the following classes</b><br><br>
-> Iterator (interface)<br>
-> EmployeeIterator (Used in whole code Project)<br>

<h3>Extract Method</h3>
<b>Applied to the following classes</b><br><br>
-> NextDay<br>
-> ChooseADifferentAgenda<br>
-> NewAgenda<br>


<h3>Singleton</h3>
<b>Applied to the following classes</b><br><br>
-> SingletonPrint<br>
-> SingletonShowOptions<br>
