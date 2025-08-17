# Linux Assignment – File Operations & Shell Scripting  

This README documents the solutions for the Linux assignment problems related to **directory operations**, **file permissions**, and a **keyword search shell script**.

---

## 📂 Q1. Directory & File Operations  

### Step 1: Create Directory Structure
```bash
cd ~                          # Go to home directory
mkdir CS202                   # Create CS202 directory
cd CS202                      # Enter CS202
mkdir Dir1 Dir2               # Create two directories Dir1 and Dir2
cd Dir1
echo "This is a test file" > test.txt   # Create test.txt with some text
mkdir Dir3                    # Create Dir3 inside Dir1
```

**Resulting Structure:**
```
CS202/
 ├── Dir1/
 │    ├── test.txt
 │    └── Dir3/
 └── Dir2/
```

---

### Step 2a: Copy Dir1 into Dir2
```bash
cp -r Dir1 ../Dir2/
```

**Updated Structure:**
```
CS202/
 ├── Dir1/
 │    ├── test.txt
 │    └── Dir3/
 └── Dir2/
      └── Dir1/
           ├── test.txt
           └── Dir3/
```

---

### Step 2b: Remove Write Permission (Make Read-Only)
```bash
cd ../Dir2/Dir1
chmod -w test.txt
```

Check by trying:
```bash
echo "New text" >> test.txt   # Output: Permission denied
```

---

### Step 2c: Report File Permissions
```bash
ls -l test.txt
```

**Example Output:**
```
-r--r--r--  1 user user 20 Aug 17 12:00 test.txt
```
- `r--` = read-only  
- First 3 = user, next 3 = group, last 3 = others  

---

## 📜 Q2. Shell Script to Search Keyword "CS 202"  

### Step 1: Create a File
```bash
echo "CS 202 is a subject
We study CS 202
I like CS 202" > myfile.txt
```

---

### Step 2: Create Script `search_cs202.sh`
```bash
#!/bin/bash
# Script to search keyword "CS 202" in a file and count occurrences

echo "Enter filename:"
read filename

echo "Counting 'CS 202' in $filename ..."
grep -o "CS 202" "$filename" | wc -l
```

Make script executable:
```bash
chmod +x search_cs202.sh
```

Run the script:
```bash
./search_cs202.sh
```

Enter:
```
myfile.txt
```

**Output:**
```
Counting 'CS 202' in myfile.txt ...
3
```

---

## ✅ Summary of Commands Used
- `mkdir` → Create directories  
- `echo > file` → Write into file  
- `cp -r` → Copy directories recursively  
- `chmod -w` → Remove write permission  
- `ls -l` → Show file permissions  
- `grep -o "pattern" file | wc -l` → Count keyword occurrences  

---
