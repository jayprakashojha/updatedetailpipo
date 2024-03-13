(function(){
    console.log("Hello World!");
})();

<script type="text/javascript">
    function bye(){
        alert("Before Ajax..!");
        $.ajax({
            type: "POST",
            url: "/punchinout",
            data: form.serialize(),
            success: function (response) {
                
                alert("success");
             
             
            },
            error: function (response) {
               // hidelodder();
                
                alert("some Error");

            }
        });
      
    }
</script>
