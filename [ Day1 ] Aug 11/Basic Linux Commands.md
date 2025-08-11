# Linux Command Usage Guide

This guide provides a categorized overview of common Linux commands with concise explanations and basic syntax examples.

## 1. Information Management Commands

| Command   | Description                          | Usage Examples                              |
|-----------|--------------------------------------|--------------------------------------------|
| `cal`     | Displays calendar                    | `cal`, `cal 2024`                          |
| `ncal`    | Displays alternative calendar layout | `ncal -w`, `ncal -M`                       |
| `date`    | Shows/sets system date & time        | `date`, `date +"%F"`                       |
| `tty`     | Prints current terminal name         | `tty`                                      |
| `sh`      | Bourne shell interpreter             | `sh`, `sh script.sh`                       |
| `env`     | Lists/sets environment variables     | `env`, `env VAR=value command`             |
| `man`     | Displays command manuals             | `man ls`, `man grep`                       |
| `who`     | Shows logged-in users                | `who`, `who -b`                            |
| `whoami`  | Prints current username              | `whoami`                                   |


## 2. Utility Commands

| Command               | Description                              | Usage Examples                                  |
|-----------------------|------------------------------------------|------------------------------------------------|
| `cat`                 | Displays file content                    | `cat file.txt`                                 |
| `cat > filename`      | Creates new file (overwrite)             | `cat > new.txt` + Type content + `Ctrl+D`      |
| `cat >> filename`     | Appends to existing file                 | `cat >> log.txt` + Add content + `Ctrl+D`      |
| `cat < filename`      | Input redirection (equivalent to `cat`)  | `cat < input.txt`                              |
| `wc`                  | Counts lines/words/characters            | `wc notes.txt`, `wc -l data.csv`               |
| `echo`                | Prints text/variables                    | `echo "Hello"`, `echo $HOME`                   |
| `head`                | Shows first lines of file                | `head file.log`, `head -n 10 data.txt`         |
| `tail`                | Shows last lines of file                 | `tail log.txt`, `tail -f /var/log/syslog`      |
| `less`                | Advanced paginated file viewer           | `less large_file.log`                          |
| `more`                | Basic paginated file viewer              | `more long_text.txt`                           |
| `sort`                | Sorts lines                              | `sort names.txt`, `sort -r -n numbers.txt`     |
| `grep`                | Searches text patterns                   | `grep "error" system.log`, `grep -i "success"` |
| `bc`                  | Calculator                               | `echo "15 * 3" | bc`                            |
| `cmp`                 | Compares files byte-by-byte              | `cmp file1.bin file2.bin`                     |
| `comm`                | Compares sorted files line-by-line       | `comm sorted1.txt sorted2.txt`                |
| `diff`                | Shows file differences                   | `diff config_old.conf config_new.conf`         |


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


| Command         | Description                              | Usage Examples                                  |
|-----------------|------------------------------------------|------------------------------------------------|
| `mkdir`         | Creates directories                      | `mkdir project`, `mkdir -p docs/{public,private}` |
| `rmdir`         | Removes empty directories                | `rmdir empty_folder`                           |
| `ls`            | Lists directory contents                 | `ls`, `ls ~/Downloads`                         |
| `ls -a`         | Shows all files (including hidden)       | `ls -a`                                        |
| `ls -l`         | Detailed listing                         | `ls -l`, `ls -lh` (human-readable sizes)       |
| `ln`            | Creates links                            | `ln -s /path/original symlink` (symbolic link) |
| `cp`            | Copies files/directories                 | `cp file.txt backup/`, `cp -r dir1 dir2`       |
| `rm`            | Deletes files/directories                | `rm old.txt`, `rm -rf temp_dir` (recursive force) |
| `mv`            | Moves/renames files                      | `mv file.txt renamed.txt`, `mv *.jpg images/`  |
| `file`          | Identifies file type                     | `file unknown.dat`                             |
| `chmod`         | Changes permissions                      | `chmod +x script.sh`, `chmod 644 config.cfg`   |
| `chown`         | Changes owner/group                      | `chown user:group file.txt`                    |
| `find`          | Searches for files                       | `find / -type f -name "*.conf"`, `find . -size +100M` |
| `locate`        | Fast file search                         | `locate *.jpg` (requires `updatedb`)           |
| `mount`         | Mounts filesystems                       | `mount /dev/sdb1 /mnt/external`                |
| `umount`        | Unmounts filesystems                     | `umount /mnt/external`                         |



## 4. Process Management
| Command | Usage |
|---------|-------|
| **ps** | Lists running processes. Example: `ps aux`. |
| **kill** | Terminates processes by PID. Example: `kill 1234`. |

| Command   | Description                          | Usage Examples                                  |
|-----------|--------------------------------------|------------------------------------------------|
| `ps`      | Lists running processes              | `ps aux`, `ps -ef`                             |
| `kill`    | Terminates processes                 | `kill 1234`, `kill -9 5678` (force kill)       |



## 5. Editors
| Command | Usage |
|---------|-------|
| **vi** | Modal text editor. |
| **gedit** | GUI text editor (GNOME). |
| **joe** | Simple terminal text editor. |
| **mcedit** | Editor from Midnight Commander. |
| **emacs** | Powerful text editor/IDE. |


| Command   | Description                          | Usage Examples                                  |
|-----------|--------------------------------------|------------------------------------------------|
| `vi`      | Terminal text editor                 | `vi document.txt` (Press `i` to insert, `:wq` to save & exit) |
| `gedit`   | Graphical text editor                | `gedit notes.txt`                              |
| `joe`     | User-friendly terminal editor        | `joe config.ini`                               |
| `mcedit`  | Midnight Commander editor            | `mcedit file.txt`                              |
| `emacs`   | Extensible editor                    | `emacs code.py`                                |


## Usage Tips
- **Permissions**: Use `sudo` for commands requiring root access
- **Wildcards**: `*` (multiple chars), `?` (single char)
- **Redirection**: `>` (overwrite), `>>` (append)
- **Pipes**: Chain commands with `|` (e.g., `ps aux | grep chrome`)

