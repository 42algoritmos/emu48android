DESCRIPTION

This project ports the Windows application Emu48 written in C to Android.
It uses the Android NDK. The former Emu48 source code (written by Sébastien Carlier and Christoph Giesselink) remains untouched because of a thin win32 emulation layer above Linux/NDK!
This win32 layer will allow to easily update from the original Emu48 source code.
It can open or save the exact same state files (state.e48/e49) than the original Windows application!

Some KML files with theirs faceplates are embedded in the application but it is still possible to open a KML file and its dependencies by selecting a folder.

The application does not request any permission (because it opens the files or the KML folders using the content:// scheme).

The application is distributed with the same license under GPL and you can find the source code here:
https://github.com/dgis/emu48android


QUICK START

1. From the left side, slide your finger to open the menu.
2. Touch the "New..." menu item.
3. Select a predefined faceplate (or select a custom KML script folder with Android >= 5.0).
4. And the calculator should now be opened.


NOTES

- The Help menu displays Emu48's original help HTML page and may not accurately reflect the behavior of this Android version.
- When using a custom KML script by selecting a folder, you must take care of the case sensitivity of its dependency files.
- Starting with the version 1.4, a RAM card generator for the port 2 of the HP48SX and HP48GX has been added.
  Like with the MKSHARED.EXE on Windows, you can generate the card in a file (i.e.: SHARED.BIN).
  And then, to use with the HP48SX or the HP48GX, you must select this generated file in the "Settings/Port2 File".
- By default when you create a new HP49/50 with the embedded readonly file "rom.49g",
  everything that you store in port 2 is lost just because the file "rom.49g" is READONLY.
  But it works exactly like with Windows. If you can write in the ROM file,
  it should save the content of port 2 in the ROM file with Android too.
  To save the port 2 in the HP49/50 with Emu48 for Android:
  * copy "real50g-lc.kml", "real50g-lc.png", "keyb4950.kmi",  "rom.49g" in a FOLDER of your Android device,
  * in the menu:
   - touch "New..." to create a new device
   - or touch "Change KML Script..." to change the current KML script and ROM location
  * select "[Custom KML script...]"
  * select the FOLDER
  * pick the calculator (which should be "Eric's Real 50g (Large Cropped)")!
  And because, the file "FOLDER/rom.49g" is not readonly anymore, you can save your port 2.
  BUT for the moment, it is saved ONLY when you CLOSE (or change) the state file. Not when you end the application.
- To speed up printing, set the 'delay' to 0 in the calculator's print options.


NOT WORKING YET

- Disassembler
- Debugger
- Serial Ports (Wire or Ir)


CHANGES

Version 1.5 (2019-07-11)

- Add the Ir printer simulator based on the Christoph Giesselink's HP82240B Printer Simulator for Windows.
- Add the macro support.
- Refactor the code for easier code sharing between Emu48, Emu42 and Emu71.
- Fix: Bad text characters when copy/paste the stack.
- Fix: Selecting an empty KML folder prevent to select the default embedded KML folder (Github Fix: #5)!
- Fix a crash with waveOutClose().
- Fix an issue with the Pan and zoom which was possible after closing the calc.
- Prevent the ESC key from leaving the application (Github Fix: #6).
- Map the keyboard DELETE key like it should (Github Fix: #6).
- Map the +, -, * and / keys catching the typed character instead of the virtual key (Github Fix: #6).
- Fix the printer icon in the Eric's script "real49gp-lc.kml" and "real50g-lc.kml".
- Improve the swipe gesture.
- Fix the On+D tests for hp49/50 by mocking "serial.c".


Version 1.4 (2019-06-08)

- Add an optional menu button in the top left corner.
- Add a RAM card generator for the port 2 of the HP48SX and HP48GX.
- Add the possibility to hide the status and/or the navigation bars.
- Rewrite the timers engine (Hoping this fixes the issue with the stuck "busy" annunciator.)
- Update the Win32 layer from Emu42 dev.
- Fix the authentic speed issue at the first start.
- Fix the non working Restore/Delete backup.
- Prevent to load/save object and copy/paste with HP39/40.
- Add a volume slider in the settings.
- Add a rotation option.
- Warn the user about the KML folder selection if this is Android < 5.0


Version 1.3 (2019-04-04)

WARNING: WITH VERSION 1.3, THE STATUS FILE HAS BEEN MODIFIED AND IS NOW FULLY COMPATIBLE WITH THE WINDOWS VERSION AS IT SHOULD HAVE BEEN.
HOWEVER, BEFORE THE UPDATE, BACK UP YOUR DATA BECAUSE YOU COULD LOSE THEM.

- Fix the red and blue color inversion.
- Add the HP 50g (Calypso 2K/4K) KML script from Carl Reinke (4K is a slow because there is no hardware acceleration).
- Fix a bug about the timer delay in timeSetEvent().
- Fix deprecated classes in the settings.
- Add an optional haptic feedback when touching a button.
- Fix the intermittent slow down due to the end of playing a sound.
- Fix blank screen when switching the KML faceplate.
- Add more traces in the win32 log.
- Allow to select the background color (missing a custom color).
- Thanks to Christoph Giesselink about the state file compatibility issue (sizeof(BOOL) should be 4 and not 1).
- Allow to fully switch the sound off.


Version 1.2 (2019-03-14)

- Use the KML Global color as background color.
- Set the extension .e49 when "Saving as" a state file with model 'Q'.
- Fix a crash after opening several times a state file.
- Fix On-D diagnostic not working for 48gII/49G/49g+/50g (rom 2.15 not good, change for 2.10).
- Improve the scrolling issue found in Emu48 1.59+.
- Rewrite the StretchBlt() function to improve the pixel rendering.
- Allow to build the project with "gradlew build".
- Fix issues with back button in the Settings, Help and About.
- Build with Android 4.4 support (Not sure the settings work).
- Prevent empty MRU.
- Allow to go back from the settings in Android 4.4 and may be more recent versions.
- Save the Port 2 at the same time we save the state file.
- Change the name from "Emu48 for Android" for "Emu48".
- Always prompt to save when closing.
- Fix MostRecentUsed file issue.
- Update the core source code to Emu48 1.60+.


Version 1.1 (2019-03-01)

- Update the KML scripts and the images from Eric Rechlin.
- Fix crash when changing the main image.
- Fix an issue when KML file is not found.


Version 1.0 (2019-02-28)

- First public version available on the store.


LICENSES

Android version by Régis COSNIER.
This program is based on Emu48 for Windows version, copyrighted by Christoph Gießelink & Sébastien Carlier, with the addition of a win32 layer to run on Android.

This program is free software; you can redistribute it and/or modify it under the terms of the GNU General Public License as published by the Free Software Foundation; either version 2 of the License, or (at your option) any later version.
This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU General Public License for more details.
You should have received a copy of the GNU General Public License along with this program; if not, write to the Free Software Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA 02110-1301 USA.

Note: some included files are not covered by the GPL; these include ROM image files (copyrighted by HP), KML files and faceplate images (copyrighted by their authors).
The Eric's Real scripts ("real*.kml" and "real*.bmp/png") are embedded in this application with the kind permission of Eric Rechlin.