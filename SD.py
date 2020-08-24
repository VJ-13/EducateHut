# import modules
import os
import datetime
import time
import PySimpleGUI as sG

time.sleep(60)
# Text in warning message and ok button
warning = [[sG.Text("It's 11:30! Your Computer will shut down in 30 seconds!")], [sG.Button("OK")]]
# Create the pop up message
tab = sG.Window("WARNING", warning)

# Have a loop which constantly checks for the time
while True:
    # make variable = current time
    now = datetime.datetime.now().time()
    # run if statement to determine when time is 11:30 p.m.
    if now.hour == 23 and now.minute == 30:
        # create a continuous loop to check for user action
        while True:
            event, values = tab.read()
            # Close window if user closes tab or presses the OK button
            if event == "OK" or event == sG.WIN_CLOSED:
                break
        # close window
        tab.close()
        # delays 30 seconds
        time.sleep(30)
        # shutdown computer
        os.system("shutdown -h now")
