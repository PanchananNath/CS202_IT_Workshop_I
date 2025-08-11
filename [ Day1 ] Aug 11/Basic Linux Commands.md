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
