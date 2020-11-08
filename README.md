# SimpleDashBoard


A simple & curved & material bottom navigation for Android.  
<img src="images/appearance.gif" width="300" height="600">

  

  
## DESIGN 

Change to ScrollView 
```xml  
<ScrollView xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    tools:context=".MainActivity">
    
    </ScrollView>
```  
## TEXT AND IMAGE 


<img src="images/top.PNG" >

1. Add LinearLayout
```xml 
<LinearLayout
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        android:background="@drawable/gradient"
        android:orientation="vertical">


```  

2.Add RelativeLayout

```xml 
 <RelativeLayout
            android:layout_width="wrap_content"
            android:layout_height="match_parent"
            android:layout_marginLeft="20dp"
            android:layout_marginRight="20dp"
            android:layout_marginTop="30dp">

``` 

3. Add TextView and ImageView


```xml 
<TextView
                android:layout_width="wrap_content"
                android:layout_height="wrap_content"
                android:text="Welcome Marko"
                android:textColor="#000000"
                android:textSize="22sp"
                />

            <ImageView
                android:layout_width="60dp"
                android:layout_height="60dp"
                android:src="@drawable/profile"
                android:layout_alignParentRight="true"
                />
                
 </RelativeLayout>

``` 

## CARDVIEW 


<img src="images/cardview_2.PNG" >

1. Add GridLayout

```xml 
<GridLayout
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:rowCount="3"
            android:columnCount="2"
            android:alignmentMode="alignMargins"
            android:columnOrderPreserved="false">

``` 

2. Add CardView

```xml 
 <androidx.cardview.widget.CardView
                android:tag="1" --> this is for onClick method
                android:onClick="cardViewClick"
                android:layout_width="wrap_content"
                android:layout_height="wrap_content"
                android:layout_columnWeight="1"
                android:layout_rowWeight="1"
                app:cardElevation="6dp"
                app:cardCornerRadius="12dp"
                android:layout_margin="12dp"
                >

``` 

3. Add Linear Layout in CardView for positioning Image and Text inside of CardView


```xml 
 <LinearLayout
                    android:layout_width="match_parent"
                    android:layout_height="match_parent"
                    android:gravity="center"
                    android:padding="16dp"
                    android:orientation="vertical">

``` 

4. Add ImageView and TextView


```xml 
<ImageView
                        android:layout_width="80dp"
                        android:layout_height="80dp"
                        android:src="@drawable/calendar"
                        />

                    <TextView
                        android:layout_width="wrap_content"
                        android:layout_height="wrap_content"
                        android:text="Date"
                        android:textSize="18sp"
                        android:textColor="#000000"
                        android:layout_marginTop="12dp"
                        />
                        
                        </LinearLayout>
                        
                        </androidx.cardview.widget.CardView>
``` 

5. Then paste this code x8: 

```xml 
<androidx.cardview.widget.CardView
                android:tag="2"
                android:layout_width="wrap_content"
                android:layout_height="wrap_content"
                android:layout_columnWeight="1"
                android:layout_rowWeight="1"
                app:cardElevation="6dp"
                app:cardCornerRadius="12dp"
                android:onClick="cardViewClick"
                android:layout_margin="12dp"
                >


                <LinearLayout
                    android:layout_width="match_parent"
                    android:layout_height="match_parent"
                    android:gravity="center"
                    android:padding="16dp"
                    android:orientation="vertical">

                    <ImageView
                        android:layout_width="80dp"
                        android:layout_height="80dp"
                        android:src="@drawable/briefcase"
                        />

                    <TextView
                        android:layout_width="wrap_content"
                        android:layout_height="wrap_content"
                        android:text="Business"
                        android:textSize="18sp"
                        android:textColor="#000000"
                        android:layout_marginTop="12dp"
                        />


                </LinearLayout>



            </androidx.cardview.widget.CardView>
```

##BACKGROUND

1.Create new XML file on drawable folder and paste this code: 

```xml 

<shape xmlns:android="http://schemas.android.com/apk/res/android">

    <gradient
        android:angle="180"
        android:centerColor="#26C986"
        android:endColor="#109F8D"
        android:startColor="#36ED81"
        android:type="linear"

        />
</shape>


```
