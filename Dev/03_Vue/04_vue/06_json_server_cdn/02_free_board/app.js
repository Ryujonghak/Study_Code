new Vue({
  el:'#app',
  data: {
    freeboards : [],
    freeboard : {},
    isUpdate:false,
    show:false,
    send:false
  },
  created() {
    this.retrive();
  },
  methods: {
    retrive() {
      axios.get('http://localhost:3000/freeboards')
      .then((res) => {
        console.log(res); //성공시
        this.freeboards = res.data;
      })
      .catch((err) => {
        console.log(err); //에러 발생시
      });
    },
    showForm(free){
      this.show = true; 
      if((free !== undefined)){
        this.freeboard = free;
        this.isUpdate=true;
      }
    },
    btnOK(){
      this.send=true;
      //if(this.isUpdate == false) this.addEmployee();	
      (this.isUpdate == false)? this.addFree() : this.updateFree(this.freeboard.id);
    },
    btnCancel(){ 
      this.show=false; this.send=false; 
    },
    addFree(){
      if(this.send == true){
        axios.post('http://localhost:3000/freeboards',
            { 
              "id": this.freeboard.id, 
              "title": this.freeboard.title, 
              "content": this.freeboard.content,
              "writer": this.freeboard.writer
            })
        .then((res) => { console.log(res);  })
        .catch((err) => { console.log(err);  }) //에러 발생시
        this.show=false;
        this.send=false;
      }
    },
    updateFree(id){
      axios.put('http://localhost:3000/freeboards/'+id,{
        "id": this.freeboard.id,
        "title": this.freeboard.title,
        "content": this.freeboard.content,
        "writer": this.freeboard.writer
      }) 
      .then((res) => {
        console.log(res); //성공시
        this.isUpdate =false;
      })
      .catch((err) => {
        console.log(err); //에러 발생시
      });
    },
    deleteFree(id){
      axios.delete('http://localhost:3000/freeboards/'+id)
      // .then((res) => { this.freeboard.splice(id, 1); })
      .then((res) => { this.retrive(); })
      .catch((err) => { console.log(err); }); 
    }
  }
})
