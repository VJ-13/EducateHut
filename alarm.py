# import modules
import subprocess
import datetime
import PySimpleGUI as sG
alarm = [[sG.Text("It's 5:30!")], [sG.Button("Stop")]]
# Have a loop which constantly checks for the time
while True:
    # make variable = current time
    now = datetime.datetime.now().time()
# run if statement to determine when time is 5:30 p.m.
    if now.hour == 17 and now.minute == 30:

        tab = sG.Window("Alarm", alarm)
        while True:
            event, values = tab.read()
            # Close window if user closes tab or presses the OK button
            if event == "Stop" or event == sG.WIN_CLOSED:
                break
            else:
                subprocess.call(["afplay", "analog-alarm.mp3"])
                break
        # run alarm sound
        break
tab.close()
