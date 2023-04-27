# springbootgitadv

----------------------   GIT Hub Steps for Main Branch  ------------------------

1)	Open GitHub and Create new Repository in it. Type Unique name and also add Readme file and press on create repository.
 
2)	After creating repository copy the http url. 
 
3)	Now Create a folder in our local disk of name any GitRepo, Repo, etc. and open that folder and type the cmd in the path location.
4)	Then type command of –“ git clone and paste the url” that is copied from GitHub.

 
5)	Then hit command of cd and press tab then our Repo’s name come and then hit enter.

 
6)	Then copy our program folder and paste it in repo folder. Where our new Repository name’s folder created. Also add theory in the Readme file.
7)	After copied the file hit— "git add . “  in the cmd window.
8)	After that for adding the code there are two ways A) By using Git Step, B) By Using Git Gui
a)	By Using Git step:- hit the command in cmd window “ git commit -m “Initial Commit””

 
After hitting this command hit “ git push” command then our project added in git hub successfully.
b)	By Using Git Gui :- hit the command in cmd window “git gui” , then gui window opens then write in it “ [STNO-1] Initial commit” after that press the commit Button and push the our program on main branch by pressing push button. 
 
At the place of “Initial commit” you can give any message that you want and also story no also you can give any (“[STNO-___]”).

------------- Git Hub Steps for Creating Master Branch --------------
1)	After creating main branch hit the command in cmd window “git checkout -b master” 

 

2)	After that hit “ git branch ” to check our master branch is created or not it shows in green colour.  

3)	Then hit “ git push ”. if the our master is not created then it gives suggestion then copy this and paste and then enter . then our master branch is created successfully .

 
------------ Git Hub Steps for Creating Feature Branch -----------

1)	After Creating Master branch, for creating feature branch we need to give access to other employee for that in GitHub go to “Setting---> Collaborators---> Type Password to confirm.”

 

2)	After typing password, this Manage access window open in that window click on “Add people” in that type email id for invite of that person who has to give access.
3)	After inviting the invite link goes to that person for accept. After accepting invitation that person is able to see the GitHub code and branches.

---below method for the person who gives the access---

4)	For creating feature branch again go to “code--> copy the http link”.
5)	Goes to your local disk and create folder name as GitRepo, Repo, etc.
6)	In that folder type “cmd” in the path location.
7)	In cmd window give command “git clone and paste the url/” which is copied from the GitHub and type enter.
 

8)	Then again give command “cd and press the tab for the our repository name” and enter.
 

9)	After that the project cloned successfully in repo folder. Then copy the path of that project and import it in IntelliJ Idea and run it. It will run project without doing anything.
10)	Now for creating feature branch again come in cmd window, first create the master branch for that give the command “git checkout -b master” and hit enter. 

 

11)	After that hit “ git branch ” to check our master branch is created or not it shows in green colour.  
12)	After creating the Master branch now for creating feature branch give the command in cmd window is “git checkout -b ___(name of the feature branch) and hit enter.
13)	Then give command “git branch” it will shows the all branches name.
 

14)	Then goes to IntelliJ Idea their will show our feature branch name at right side bottom of program.
 

15)	Now in IntelliJ Idea write the code that you want, write api in controller layer then Again run the program and check that Api is working or not.
16)	After that come again in cmd window for committing the changes that we did means add api, write code in existing program that code we have to commit on GitHub again.
17)	Give the command of “git gui” and then gui window opens.
 

18)	Then Gui window open in that click on commit button on upper menu bar in that click on Stage to Commit the code will goes down to the Staged Changes

 

19)	After coming in Staged Commit give the story no anything unique and then click on Commit and then click Push.

 

20)	After clicking the Push the push branches window open in that all branches name comes then select the feature branch name where you want to save the changed program and then click again push button on that window.(vehicle_loan is the feature branch name and in that available the push button). 
 

21)	Now our program is saved to feature branch but in master branch there is no any data so merge the feature branch and master branch is required for that right click on project go to 
“Right Click on project Git Branches  Click on Master  Click Checkout”

 


 

22)	Then in Right bottom corner the master branch name come
 
23)	After that for merging the two feature branch and the master branch for the data transfer do “Right click on project  Git Merge Merge into Master Tab open Select the Our feature branch name”Click on Merge”.

 

24)	After that all data from the Feature branch is come to Master Branch then we have to push it on GitHub So Again “Right click on project Git Push PushLoginToGitHub Authorize in GitHub Authorize JetBrains”. Now The code successfully uploaded on master branch also. Go to GitHub And Check it.

     
