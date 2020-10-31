// // alert ('OK');
// document.addEventListener('DOMContentLoaded', () => {
//     const btn = document.createElement('button');
//     btn.classList.add('changeButton');
//     btn.setAttribute('id', 'v_hangeButton');
//     btn.innerText = '|| zamień dane';

//     const langForm = document.querySelector('form');
//     langForm.setAttribute('action', '');
//     langForm.after(btn);

//     const changeContentVertical = () => {
//         const inputLang = document.querySelectorAll('form input.col3');
//         const inputPL = document.querySelectorAll('#gridPL input.col3');

//         for (let i = 1; i < inputLang.length; i++) {
//             inputLang[i].setAttribute("value", inputPL[i].getAttribute("value"));
//         }
//     }

//     const changeDescription = () => {
//         const description2 = document.querySelector('form textarea.description2');
//         const descrPL = document.querySelector('form .row_description span.description').innerHTML;
//         description2.innerHTML = descrPL;
//     }

//     btn.addEventListener('click', () => {
//         changeContentVertical();
//         changeDescription();
//     });
// });
