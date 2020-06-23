### 新增一項功能於DataApi.java     
### 預設port為8099，可自行更改。      
### 資料儲存於server之arraylist，一旦關閉伺服器，資料將被清除。
### 附件users內含四名使用者之JSON假資料，可直接使用。     
## 1. POST : 新增資料。   
於postman選擇POST，路徑： http://localhost:8099/Username/Add_User_Response   
於body打上欲新增資料之JSON格式，send。          
伺服器回應：rsp_code":0,"rsp_msg":"Success