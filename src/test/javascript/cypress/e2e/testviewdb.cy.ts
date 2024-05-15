describe('Login and navigate to a page', () => {
  it('Logs in, navigates to entities, clicks on product, and views the first product', () => {
    const username = 'username';
    const password = 'username';
    const email = 'username@gmail.com';

    cy.visit('http://localhost:8080/account/register');

    cy.get('input[name="username"]').type(username);
    cy.get('input[name="email"]').type(email);
    cy.get('input[name="firstPassword"]').type(password);
    cy.get('input[name="secondPassword"]').type(password);

    cy.get('button[type="submit"]').click();
  });
});
