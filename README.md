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
