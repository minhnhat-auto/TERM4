# Go to https://sqliteonline.com/
# Try:
# SELECT * FROM demo WHERE id=1;
# SELECT * FROM demo WHERE name="Chart"
# Go to File -> Save DB to download sqlite.db
# Move sqlite.db to the same folder as main.py

# Import the library needed for connecting to SQLLite
import sqlite3
import function
from contextlib import closing

# Lab 10 - Open the SQL Connection and create a cursor
# You need a cursor later to execute the query
db_file = "sqlite.db"
db_con = sqlite3.connect(db_file)
# 4.a1:
try:
    # Close the SQL Connection
    # Q3:
    with closing(db_con.cursor()) as cursor:
        # print(db_con)
        # cursor = db_con.cursor()
        # print(cursor)
        print("Database created and Successfully Connected to SQLite")

        # # Prepare and Execute Query 1: Select the version of SQL
        # query1 = "select sqlite_version();"
        # print("---")
        # print("Query: " + str(query1))
        # cursor.execute(query1)
        # row = cursor.fetchone()
        # print("SQLite Database Version is: ", row)
        #
        # # Lab 10 - Prepare and Execute Query 2: Select Everything in the table
        # Use the query_executor(cursor, query_name) function
        # 4.b2:
        try:
            query2 = "SELECT * FROM demo"
            cursor = function.query_executor(cursor, query2)
            function.query_response(cursor, "fetchmany", 5)
        except sqlite3.NotSupportedError as e:
            print(str(e))

        # 4.b3:
        # # Prepare and Execute Query 3
        try:
            query3 = "SELECT * FROM demo WHERE name='Chart'"
            cursor = function.query_executor(cursor, query3)
            function.query_response(cursor, "fetchall")
        except sqlite3.NotSupportedError as e:
            print(str(e))
        #
        # # Prepare and Execute Query 4
        # query4 = "SELECT * FROM demo WHERE id > 10 and id < 13"
        # cursor = function.query_executor(cursor, query4)
        # all_rows = function.query_response(cursor, "fetchall")
        # # Print out the number of rows selected
        # print("There is/are " + str(len(all_rows)) + " row(s) selected")
        # print("---")
        #
        # # Lab 10 - Get user input for Query 5
        # print("Look for a number between:")
        # small_num = int(input("small number: "))
        # big_num = int(input("and big number: "))
        #
        # # Prepare and Execute Query 5
        # query5 = "SELECT * FROM demo WHERE id > ? and id < ?"
        # # And a new argument to cursor.execute, instead of using the default
        # cursor.execute(query5, (small_num, big_num))
        # function.query_response(cursor, "fetchall")
        #
        # # Lab 10 - Extract each cell from all_rows using indices
        # query6 = "SELECT * FROM demo WHERE name='Chart'"
        # cursor = function.query_executor(cursor, query6)
        # row = function.query_response(cursor, "fetchone")
        # print("ID: " + str(row[0]))
        # print("Name: " + str(row[1]))
        #
        # # Lab 10 - Insert into a table
        # query7 = "insert into demo (id, name, hint) values('28', 'New name', 'New hint')"
        # cursor = function.query_executor(cursor, query7)
        # db_con.commit()
        #
        # # Lab 10 - Update a table
        # query8 = "update demo set name = 'Newest name', hint = 'Newest hint' where id='25'"
        # cursor = function.query_executor(cursor, query8)
        # db_con.commit()
        #

        # Q4.b4:
        # # Lab 10 - String Indexing
        try:
            # Q1:
            db_con.row_factory = sqlite3.Row
            query_q1 = "SELECT * FROM demo WHERE id > 14"
            cursor.execute(query_q1)
            all_row = cursor.fetchall()
            print("---")
            for row in all_row:
                print("Name: " + str(row[1]))
        except sqlite3.IntegrityError as e:
            print(str(e))

        # Q4.b5:
        # Lab 10 - Delete from a table
        # Q2.a:
        try:
            print("---")
            del_row = int(input("Which row id wanna delete: "))
            query_q2 = "DELETE FROM demo WHERE id < ?"
            cur = cursor.execute(query_q2, (del_row, ))
            # Q2.b:
            ans = input(str(cur.rowcount) + " rows affected. Are you sure wanna continue? ")
            if ans == 1 or ans.lower() == 'yes' or ans.lower() == 'y':
                db_con.commit()
        except sqlite3.IntegrityError as e:
            print(str(e))

except sqlite3.OperationalError as e:
    print(str(e))



