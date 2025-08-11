# Linux Command Usage Guide

This guide provides a categorized overview of common Linux commands with concise explanations and basic syntax examples.

## 1. Information Management Commands
| Command | Usage |
|---------|-------|
| **cal** | Displays a calendar for the current month. Example: `cal 2025`. |
| **ncal** | Displays a vertical calendar. Example: `ncal -w`. |
| **date** | Shows/sets the system date/time. Example: `date "+%d-%m-%Y %H:%M:%S"`. |
| **tty** | Prints terminal device name. |
| **sh** | Starts a new shell or runs scripts. Example: `sh script.sh`. |
| **env** | Displays environment variables or runs a command in a modified environment. |
| **man** | Shows manual page for a command. Example: `man ls`. |
| **who** | Lists logged-in users. |
| **whoami** | Displays current username. |


## 2. Utility Commands
| Command | Usage |
|---------|-------|
| **cat** | Displays file contents. Example: `cat file.txt`. |
| **cat > filename** | Creates a new file with input until `CTRL+D`. |
| **cat >> filename** | Appends input to a file. |
| **cat < filename** | Reads and displays a file. |
| **wc** | Counts lines, words, characters. Example: `wc file.txt`. |
| **echo** | Prints text/variables. Example: `echo $HOME`. |
| **head** | Shows first lines of a file. Example: `head -n 5 file.txt`. |
| **tail** | Shows last lines of a file. Example: `tail -f log.txt`. |
| **less** | Paginated file viewer. Example: `less file.txt`. |
| **more** | Similar to `less` but older. |
| **sort** | Sorts lines in a file. Example: `sort names.txt`. |
| **grep** | Searches text patterns. Example: `grep "error" log.txt`. |
| **bc** | Command-line calculator. Example: `echo "5+3" | bc`. |
| **cmp** | Compares two files byte-by-byte. |
| **comm** | Compares two sorted files line-by-line. |
| **diff** | Shows differences between two files. |


## 3. File System Management
| Command | Usage |
|---------|-------|
| **mkdir** | Creates a directory. |
| **rmdir** | Removes an empty directory. |
| **ls** | Lists directory contents. |
| **ls -a** | Lists all files including hidden. |
| **ls -l** | Long format listing. |
| **ln** | Creates file links. Example: `ln -s file1 link1`. |
| **cp** | Copies files/directories. |
| **rm** | Deletes files/directories. |
| **mv** | Moves/renames files. |
| **file** | Displays file type. |
| **chmod** | Changes file permissions. |
| **chown** | Changes file owner/group. |
| **find** | Searches for files. Example: `find / -name "file.txt"`. |
| **locate** | Quickly finds files (needs `updatedb`). |
| **mount** | Mounts devices/filesystems. |
| **umount** | Unmounts devices/filesystems. |


## 4. Process Management
| Command | Usage |
|---------|-------|
| **ps** | Lists running processes. Example: `ps aux`. |
| **kill** | Terminates processes by PID. Example: `kill 1234`. |


## 5. Editors
| Command | Usage |
|---------|-------|
| **vi** | Modal text editor. |
| **gedit** | GUI text editor (GNOME). |
| **joe** | Simple terminal text editor. |
| **mcedit** | Editor from Midnight Commander. |
| **emacs** | Powerful text editor/IDE. |
