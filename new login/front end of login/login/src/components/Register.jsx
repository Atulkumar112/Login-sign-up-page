import {  useState } from "react";

import axios from "axios";

function Register() {
  
    const [employeename, setEmployeename] = useState("");
    const [email, setEmail] = useState("");
    const [password, setPassword] = useState("");


    async function save(event) {
        event.preventDefault();
        try {
          await axios.post("http://localhost:9090/api/v1/save", {
          userName: employeename,
          userEmail: email,
          password: password,
          });
          alert("Employee Registation Successfully");

        } catch (err) {
          alert("User Registration Successfully");
        }
      }
  
    return (
    <div>
    <div class="container mt-3" >
    <div class="card">
            <h1>Student Registation</h1>
            
    <form>
        <div class="form-group">
          <label>Employee name</label>
          <input type="text"  class="form-control" id="employeename" placeholder="Enter Name"
          
          value={employeename}
          onChange={(event) => {
            setEmployeename(event.target.value);
          }}
          />

        </div>

        <div class="form-group">
          <label>email</label>
          <input type="email"  class="form-control" id="email" placeholder="Enter Email"
          
          value={email}
          onChange={(event) => {
            setEmail(event.target.value);
          }}
          
          />
 
        </div>

        <div class="form-group">
            <label>password</label>
            <input type="password"  class="form-control" id="password" placeholder="Enter password"
            
            value={password}
            onChange={(event) => {
              setPassword(event.target.value);
            }}
            
            />
          </div>

        <button type="submit" class="btn btn-primary mt-4" onClick={save} >Save</button>
       
      </form>
    </div>
    </div>
     </div>
    );
  }
  
  export default Register;

// import { useState} from 'react';
// import axios from "axios";
// import React from 'react'

// const Register = () => {

//     const [emoployeename, setEmployeename] = useState("");

//     const [email, setEmail] = useState("");
//     const [password, setPassword] = useState("");

//     async function save(event){
//         event.preventDefault();
//         try{
//             await axios.post("http://localhost:9090/api/v1/save", {
//                 userName: emoployeename,
//                 email: email,
//                 password: password,
//             });

//             alert("Student Registration Successfully");
//         } catch(err){
//             alert(err);
//         }
//     }



//   return (
//     <div>
//         <div className='contianer mt-4'>
//             <div className='card'>
//                 <h1>Student Resgistration</h1>

//                 <form>
//                     <div className='form group'>
//                         <label>User Name</label>
//                         <input type="text" class="from-control" id="employeename" placeholder="Enter Name">

//                         value ={emoployeename}
//                         onChange={(event) => {
//                             setEmployeename(event.target.value);
//                         }}
//                         </input>
//                     </div>

//                     <div className='form group'>
//                         <label>Email</label>
//                         <input type="email" class="form-control" id="email" placeholder='Enter Email'>

//                         value = {email}
//                         onChange{(event) =>{
//                             setEmail(event.target.value);
//                         }}
//                         </input>
//                     </div>


//                     <div className='form group'>
//                         <label>Password</label>
//                         <input type="password" class="form-control" id="password" placeholder='Enter Password'>

//                         value = {password}
//                         onChange{(event) =>{
//                             setEmail(event.target.value);
//                         }}
//                         </input>
//                     </div>
                        
//                     <button type="submit" color='blue' class="btn btn primary mt-4" onClick={save}>Save</button>
//                 </form>
//             </div>
//         </div>
//     </div>

//     //--------------------------------------------------------
//     // <form>

//     //     <div className='container' >
//     //         <h1>Registration</h1>
//     //         <p>Please fill the form to create an account</p>
            
//     //             <div>
//     //                 <label for="email"><b>Username</b></label><br></br>
//     //                 <input type="text" placeholder="Enter the username" name="username" id='username' required></input>
//     //             </div>
                
//     //             <div>
//     //                 <label for="email"><b>Email</b></label><br></br>
//     //                 <input type="text" placeholder="Enter the email" name="email" id='email' required></input>
//     //             </div>

//     //             <div>
//     //                 <label for="email"><b>Password</b></label><br></br>
//     //                 <input type="text" placeholder="Enter the password" name="password" id='password' required></input>
//     //             </div>
                

//     //             <button type="submit" class="registerbtn">Register</button>

            
//     //     </div>   
    
//     // </form>
    
//   )
// }

// export default Register