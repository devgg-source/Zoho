#include <iostream>
using namespace std;

struct Node
{
    int data;
    Node *next;
    Node(int x)
    {
        data = x;
        next = NULL;
    }
};

void print(struct Node *temp)
{
    while (temp != NULL)
    {
        cout << temp->data << " ";
        temp = temp->next;
    }
}

void insert(Node **head)
{
    int n, value;
    Node *temp;
    cin >> n;
    for (int i = 0; i < n; i++)
    {
        cin >> value;

        if (i == 0)
        {
            *head = new Node(value);
            temp = *head;
        }
        else
        {
            temp->next = new Node(value);
            temp = temp->next;
        }
    }
}
int main()
{

    int t;
    cin >> t;
    Node *head = NULL;
    while (t--)
    {
        head = NULL;
        insert(&head);
        print(head);
    }
}
