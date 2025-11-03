## AD_10_Market_App

### 📱 Short Description

A **Market/Grocery list** application built specifically to demonstrate efficient data display using **RecyclerView** and the supporting adapter framework.

---

### 🧩 Concepts Covered

* **RecyclerView** (efficient UI component for displaying large data sets)
* **View Recycling** (reusing existing layouts to improve performance)
* **Layout Manager** (`LinearLayoutManager`)
* **Custom Adapter** (extending `RecyclerView.Adapter`)
* **Model Class** (`Item`) (structure for image, name, and description)
* **Custom Item Click Listener** (Interface)

---

### 🎯 Learning / Discovery Points

* Understanding that RecyclerView improves performance by reusing/recycling views, reducing memory consumption.
* Implementing the mandatory methods of the custom adapter: `onCreateViewHolder`, `onBindViewHolder`, and `getItemCount`.
* Initializing the `LinearLayoutManager` and assigning it to the RecyclerView.
* Creating a modular click handling interface (`ItemClickListener`) for cleaner code organization.

---

### ⚙️ App Features / Usage

* Displays a vertically scrolling list of market items (images, titles, descriptions).
* Allows for handling item click events on individual list elements.

---

### Screenshots
<table style="width:100%;"> 
  <tr> 
    <td align="center" style="width:50%;"> 
      <strong>Main Screen
        <br>
      </strong>
      <br> 
      <img src="https://github.com/MrHAM17/AD_10_Market_App/blob/main/Result%20Pics/01%20Main%20Screen.jpg" height="510" width="240"> 
  </td> 
    <td align="center" style="width:50%;"> 
      <strong>RecyclerView Screen
        <br>
      </strong>
      <br> 
      <img src="https://github.com/MrHAM17/AD_10_Market_App/blob/main/Result%20Pics/02%20RecyclerView%20Screen.jpg" height="510" width="240">
  </td> 
    <td align="center" style="width:50%;"> 
      <strong>RecyclerView Screen
        <br>
      </strong>
      <br> 
      <img src="https://github.com/MrHAM17/AD_10_Market_App/blob/main/Result%20Pics/03%20RecyclerView%20Screen.jpg" height="510" width="240">
  </td> 
    <td align="center" style="width:50%;"> 
      <strong>Toast Message
        <br>
      </strong>
      <br> 
      <img src="https://github.com/MrHAM17/AD_10_Market_App/blob/main/Result%20Pics/04%20Toast%20Message.jpg" height="510" width="240"> </td> </tr> </table>

---
