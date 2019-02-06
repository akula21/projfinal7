
$(document).ready(function () {

    $("#btn").click(function () {

        $("#prod").clone().appendTo(".allprod")

    }

    )

    $("#btn2").click(function () {

        $("#sys").clone().appendTo(".allprod")

        $("#prod").clone().appendTo(".allprod")

    })

})

// <!--<script>-->
//
// <!--$(document).ready(function () {-->
//
// <!--$("#btn").click(function () {-->
//
// <!--$("#prod").clone().appendTo(".allprod")-->
//
// <!--})-->
//
// <!--$("#btn2").click(function () {-->
//
// <!--$("#sys").clone().appendTo(".allprod")-->
//
// <!--$("#prod").clone().appendTo(".allprod")-->
// <!--})-->
//
// <!--})-->
//
// <!--</script>-->

// var a = 1;
// function increase(){
//
//
//     document.getElementById("text").value=a;
//     a=a+1;
//
//     kst++;
// }

// onclick="increase()