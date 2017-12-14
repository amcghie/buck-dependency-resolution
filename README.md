Execute a full build
```bash
buck build //...
```
Check the `buck-out` directory:
```bash
ls -lR buck-out/gen/src/com/example
``` 
Update the text in [Greeter.java](src/com/example/Greeter.java) (feel free to use your favorite text editor or IDE)
```bash
sed -i '' 's/Hello/Welcome/' src/com/example/Greeter.java
```
Re-run the build
```bash
buck build //...
```
We can see the build execute successfully and the tar file is regenerated.  This can be validated by checking the contents of the `buck-out` directory:
```bash
ls -lR buck-out/gen/src/com/example
``` 
Update the text in [Greeter.java](src/com/example/Greeter.java) back to the original value (feel free to use your favorite text editor or IDE)
```bash
sed -i '' 's/Welcome/Hello/' src/com/example/Greeter.java
```
Re-run the build
```bash
buck build //...
```
The build executes without failure, however it does not appear to execute the `build_tar` target.  Checking the contents of the `buck-out` directory:
```bash
ls -lR buck-out/gen/src/com/example
``` 
We can see that the files in `buck-out/gen/src/com/example/lib__greeter__output` have been updated, however the timestamp of the files has been corrupted.