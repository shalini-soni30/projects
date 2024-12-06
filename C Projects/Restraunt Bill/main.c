#include <stdio.h>
#include <stdlib.h>

int main()
{
    int fincash,w=1 ,Retcash,cash,ret,ch,sam,dosa,tea,tot=0,subtot=0;
    int Sqty=0,Dqty=0,Tqty=0,note,note1;
     printf("Welcome To Asterisc Hotel\n");
     while(w){
        printf("\nMenu-:\n");
        printf("1 Crispy Samosa 20/-\n");
        printf("2 Masala Dosa 30/-\n");
        printf("3 Masala Tea 10/-\n");
        printf("0 Exit\n");

  // Enter Your Choice & plates code
         printf("\nEnter Your Choice:");
         scanf("%d",&ch);
          //printf("Enter number of plates:");
          //scanf("%d",&pl);
         switch(ch){
      case 1:
          sam=20;
          printf("Enter number of plates:");
          scanf("%d",&Sqty);
          subtot= sam*Sqty;
          printf("Sub-Total:%d\n",subtot);
      break;
      case 2:
         dosa=30;
          printf("Enter number of plates:");
          scanf("%d",&Dqty);
          subtot= dosa*Dqty;
          printf("Sub-Total:%d\n",subtot);
      break;
       case 3:
         tea=10;
          printf("Enter number of plates:");
          scanf("%d",&Tqty);
          subtot= tea*Tqty;
         printf("Sub-Total:%d\n",subtot);
      break;
        case 0:
         printf("::Your Bill::\n");
          printf("Sr.No.\t| Item\t\t | Qty\t| Rate\t| Sub-total|\n");
           printf("------------------------------------------------------\n");
           if(Sqty>0)
            printf("1.\t| Samosa\t | %d\t| %d\t| %d\t\t|\n",Sqty,sam,Sqty*sam);
           if(Dqty>0)
             printf("2.\t| Dosa\t\t  | %d\t| %d\t| %d\t\t|\n",Dqty,dosa,Dqty*dosa);
            if(Tqty>0)
             printf("3.\t| Tea\t\t   | %d\t| %d\t| %d\t|\t\n",Tqty,tea,Tqty*tea);
          printf("------------------------------------------------------\n");
          printf("\t\t\t\t Grand Total: %d\n",tot);
         //printf("Your Total Amount Is:%d \n",tot);
         printf("THANK YOU! VISIT AGAIN:-)\n");

        printf("Enter Your Cash:");
        scanf("%d",&cash);
         // when user give u more than need
        if(cash>tot){
            ret=cash-tot;
         printf("\nReturn:%d\n",ret);

          note=ret/500;
            printf("500 Notes x %d \n",note);
            ret=ret%500;

            note=ret/200;
            printf("200 Notes x %d \n",note);
            ret=ret%200;

             note=ret/100;
            printf("100 Notes x %d \n",note);
            ret=ret%100;

             note=ret/50;
            printf("50 Notes x %d \n",note);
            ret=ret%50;

             note=ret/20;
            printf("20 Notes x %d\n",note);
            ret=ret%20;

             note=ret/10;
            printf("10 Notes x %d\n",note);
            ret=ret%10;

             note=ret/5;
            printf("5 Notes x %d\n",note);
            ret=ret%5;
          }
           // when user give u less than need
          else if(cash<tot){
            ret=tot-cash;
         printf("\nPlease Pay %d Rs. more \n",ret);

         printf("\nEnter Your Cash:");
         scanf("%d",&Retcash);
        fincash=Retcash-ret;

         printf("\nReturn:%d \n",fincash);


           note1=fincash/500;
            printf("500 Notes x %d \n",note1);
            fincash=fincash%500;

            note1=fincash/200;
            printf("200 Notes x %d \n",note1);
            fincash=fincash%200;

             note1=fincash/100;
            printf("100 Notes x %d \n",note1);
            fincash=fincash%100;

             note1=ret/50;
            printf("50 Notes x %d \n",note1);
            fincash=fincash%50;

             note1=fincash/20;
            printf("20 Notes x %d\n",note1);
            fincash=fincash%20;

             note1=fincash/10;
            printf("10 Notes x %d\n",note1);
            fincash=fincash%10;

             note1=fincash/5;
            printf("5 Notes x %d\n",note1);
            fincash=fincash%5;

          }
          else{

         printf("\nTHANK YOU! VISIT AGAIN:-)\n");
          }
         w=0;
      break;
       default:
        printf("Sorry It's not a valid option\n");
      break;
}//switch
    tot=tot+subtot;
   // printf("Sub-Total:%d\n",subtot);

}//while



    return 0;
}
