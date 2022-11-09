new Vue({
  el:'#app',
  data: {
    employees:[],
    employee:{ id:0, name:'', email:'' },
    isUpdate:false,
    show:false,
    send:false
  },
  created() {
    this.retrive();
  },
  methods: {
    retrive() {
      axios.get('http://localhost:3000/employees')
      .then((res) => {
        console.log(res); //성공시
        this.employees = res.data;
      })
      .catch((err) => {
        console.log(err); //에러 발생시
      });
    },
    // create 인지 update 인지 확인
    showForm(emp){
      this.show = true; 
      if((emp !== undefined)){
        this.employee.id =emp.id;
        this.employee.name = emp.name;
        this.employee.email = emp.email;    

        this.isUpdate=true;    
      }
    },
    btnOK(){
      this.send=true;
      //if(this.isUpdate == false) this.addEmployee();	
      (this.isUpdate == false)? this.addEmployee() : this.updateEmployee(this.employee.id);
    },
    btnCancel(){ 
      this.show=false; this.send=false; 
    },
    addEmployee(){
      if(this.send == true){
        axios.post('http://localhost:3000/employees',
            { "id": this.employee.id, "name":this.employee.name,"email":  this.employee.email }) 
        .then((res) => { 
          console.log(res);
          this.retrive();
        })
        .catch((err) => { 
          console.log(err);
        }) //에러 발생시 
        this.show=false;
        this.send=false;
      }
    },
    updateEmployee(id){
      axios.put('http://localhost:3000/employees/'+id,{
        "id": this.employee.id,
        "name": this.employee.name,
        "email": this.employee.email
      }) 
      .then((res) => {
        console.log(res); //성공시
        this.isUpdate =false;
        this.retrive();
      })
      .catch((err) => {
        console.log(err); //에러 발생시
      });     
    },
    deleteEmployee(id){
      axios.delete('http://localhost:3000/employees/'+id) 
      // .then((res) => { this.employees.splice(id, 1); })
      .then((res) => { this.retrive(); })
      .catch((err) => { console.log(err); });
    }
  }
})
