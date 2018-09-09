#include<stdio.h>
#include<stdlib.h>
struct Node
{
	int data;
	struct Node *next; 
};
int detectLoop(struct Node *head)
{
	struct Node *slow=head,*fast=head;
	while(slow&&fast&&fast->next)
	{
		slow=slow->next;
		fast=fast->next->next;
		if(slow==fast)
			return 1;
	}
	return 0;
}
int main()
{
	struct Node *head,*temp,*newNode;
	int ele,i,n;
	scanf("%d",&n);
	head=(struct Node*)malloc(sizeof(struct Node));
	scanf("%d",&ele);
	head->data=ele;
	head->next=NULL;
	temp=head;
	for(i=2;i<=n;i++)
	{
	    scanf("%d",&ele);
	    newNode=(struct Node*)malloc(sizeof(struct Node));
	    newNode->data=ele;
	    newNode->next=NULL;
	    temp->next=newNode;
	    temp=temp->next;
	}
	//temp->next=head->next->next->next; for loop uncomment it..

	if(detectLoop(head))
		printf("Loop");
	else
		printf("Not Loop");
		return 0;
}
